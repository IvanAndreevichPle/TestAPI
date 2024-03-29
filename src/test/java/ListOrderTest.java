import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static ru.samokat.clients.CourierClient.PATH_ORDER;

public class ListOrderTest extends TestClass{
    @Test
    @DisplayName("Получение списка заказов: эндпоинт /api/v1/orders")
    @Description("Проверка ожидаемого результата: statusCode и body")
    public void getListOrdersTest() {
        Response response = given()
                .get(PATH_ORDER);
        response.then().assertThat().statusCode(HttpStatus.SC_OK).body("$", Matchers.allOf(
                        Matchers.hasKey("orders"),
                        Matchers.hasKey("pageInfo"),
                        Matchers.hasKey("availableStations")));
    }
}