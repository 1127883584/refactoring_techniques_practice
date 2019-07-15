package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {
    @Test
    public void should_return_IE_on_Mac_when_platform_is_contains_MAC_and_browser_is_contains_IE(){
        //given
        BannerRender bannerRender = new BannerRender();

        //when
        String result = bannerRender.renderBanner("macOS","IE8");

        //then
        assertEquals("IE on Mac?", result);
    }

    @Test
    public void should_return_banner_on_Mac_when_platform_not_contains_MAC_and_browser_not_contains_IE(){
        //given
        BannerRender bannerRender = new BannerRender();

        //when
        String result = bannerRender.renderBanner("maOS","E8");

        //then
        assertEquals("banner", result);
    }

    @Test
    public void should_return_banner_on_Mac_when_platform_is_contains_MAC_and_browser_not_contains_IE(){
        //given
        BannerRender bannerRender = new BannerRender();

        //when
        String result = bannerRender.renderBanner("macOS","E8");

        //then
        assertEquals("banner", result);
    }

    @Test
    public void should_return_banner_on_Mac_when_platform_not_contains_MAC_and_browser_is_contains_IE(){
        //given
        BannerRender bannerRender = new BannerRender();

        //when
        String result = bannerRender.renderBanner("maOS","IE8");

        //then
        assertEquals("banner", result);
    }
}