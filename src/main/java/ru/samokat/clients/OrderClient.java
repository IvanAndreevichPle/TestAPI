package ru.samokat.clients;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import ru.samokat.objects.OrderObject;

import static io.restassured.RestAssured.given;
import static ru.samokat.clients.CourierClient.PATH_ORDER;
import static ru.samokat.clients.CourierClient.PATH_ORDER;

public class OrderClient {
    public ValidatableResponse requestGetListOrders(OrderObject order) {
        return given()
                .contentType(ContentType.JSON)
                .and()
                .body(order)
                .when()
                .post(PATH_ORDER)
                .then();
    }

    public void deleteTrack(int trackId) {
        given()
                .contentType(ContentType.JSON)
                .and()
                .delete(PATH_ORDER + trackId)
                .then();
    }
}