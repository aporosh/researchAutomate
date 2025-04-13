package org.example.ui.po;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$x;

public class ChallengePage {

    private final SelenideElement pageTitle = $x("/html/head/title");
    private final SelenideElement challengeTitle = $x("//div[@data-testid=\"head_title\"]");
    private final SelenideElement link1 = $x("//a[@data-testid=\"item_title\"]");
    private final SelenideElement button1 = $x( "//button[@data-testid=\"poster_button\"]");
    private final SelenideElement trial = $x("//div[@data-testid=\"trial\"]");


    //public ChallengePage(String url){
    //    Selenide.open(url);
   // }
    public void openWebSite(String url) {
        Selenide.open(url);
    }
}
