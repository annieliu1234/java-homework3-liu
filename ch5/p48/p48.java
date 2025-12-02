class p48 {   
    public static void main(String[] args) {
        CarThread car1 = new CarThread("1號車");
        car1.start();                   // 啟動執行緒

        try {
            car1.join();                // 等到 car1 執行緒結束才往下跑
        } catch (InterruptedException e) {
            // 這裡先不做任何處理
        }

        System.out.println("結束 main() 的處理工作。");
    }
}

// 原本投影片的 Car，改名成 CarThread 
class CarThread extends Thread {
    private String name;

    public CarThread(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("正在進行 " + name + " 的處理工作");
        }
    }
}
