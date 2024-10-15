public class AppChecker {

    public static void main(String[] args) {

        AndroidApp androidApp = new AndroidApp("Android");
        androidApp.appInfo();
        androidApp.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("Iphone");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();

    }
}
