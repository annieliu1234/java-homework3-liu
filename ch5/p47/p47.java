class p47 {                  
    public static void main(String[] args) {
        CarThread car1 = new CarThread("1號車");
        car1.start();        // 啟動新執行緒

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);  // 讓主執行緒睡 1 秒
                System.out.println("正在進行 main() 的處理工作");
            } catch (InterruptedException e) {
                // 這裡簡單忽略例外，不做處理
            }
        }
    }
}

// 將原本的 class Car 改名為 CarThread，避免和別的 Car 類別衝突
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
