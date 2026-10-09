package lssn7;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import static com.codeborne.selenide.Selenide.open;


public class lssn7 {

    @Test
    void TsetMyTest() {
        // Настройка браузера
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen =true; // чтобы бразуер не закрылся, для поиска Css селекторов итд
        Configuration.pageLoadStrategy = "eager"; //стратегия загрузки, не дожидаемся полной загрузки

//скрыть факт автоматизации
        ChromeOptions options = new ChromeOptions(); // создаем новый объект для обхода ботов
        options.addArguments("--disable-blink-features=AutomationControlled");
        Configuration.browserCapabilities = options;
        open("https://google.com");



    }
}
