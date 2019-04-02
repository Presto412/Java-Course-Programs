package lab;

class ShareTrading {
    private int shareVal;

    ShareTrading(int value) {
        this.shareVal = value;
    }

    synchronized public void updateShareVal(int shareVal) throws Exception {
        if (this.shareVal == -1)
            wait();
        this.shareVal += shareVal;
        notifyAll();
    }

    synchronized public void setShareVal(int shareVal) throws Exception {
        this.shareVal = shareVal;
        notifyAll();
    }

    synchronized public int getShareVal() {
        return this.shareVal;
    }
}

class TradeThread extends Thread {
    ShareTrading obj;
    int value;

    TradeThread(ShareTrading obj, int value) {
        this.obj = obj;
        this.value = value;
    }

    @Override
    public void run() {
        try {
            obj.updateShareVal(value);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class OwnerThread extends TradeThread {
    OwnerThread(ShareTrading obj, int value) {
        super(obj, value);
    }

    @Override
    public void run() {
        try {
            obj.setShareVal(this.value);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class BuyerThread extends TradeThread {
    BuyerThread(ShareTrading obj, int value) {
        super(obj, value);
    }
}

class ShareTradingTest {
    public static void main(String[] args) throws Exception {

        ShareTrading temp = new ShareTrading(-1);
        OwnerThread owner = new OwnerThread(temp, 20);
        BuyerThread buyer1 = new BuyerThread(temp, 40);
        BuyerThread buyer2 = new BuyerThread(temp, 30);
        BuyerThread buyer3 = new BuyerThread(temp, 10);
        BuyerThread buyer4 = new BuyerThread(temp, 50);
        buyer1.start();
        System.out.println("Original Share Value:" + temp.getShareVal());
        owner.start();
        buyer2.start();
        buyer3.start();
        buyer4.start();
        owner.join();
        buyer1.join();
        buyer2.join();
        buyer3.join();
        buyer4.join();
        System.out.println("Final Share Value:" + temp.getShareVal());
    }
}
