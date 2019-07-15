package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        boolean doesPlatformContainMAC = platform.toUpperCase().indexOf("MAC") > -1;
        boolean doesBrowerContainIE = browser.toUpperCase().indexOf("IE") > -1;
        if (doesPlatformContainMAC && doesBrowerContainIE){
            return "IE on Mac?";
        }
        return "banner";
    }
}
