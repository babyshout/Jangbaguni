package kopo.poly.order.service;

import kopo.poly.order.dto.ProductCrawlingDTO;

import java.io.IOException;
import java.util.List;

public interface ICrawlingService {
    List<ProductCrawlingDTO> getAceData(String keyword) throws IOException; //에이스 식자재

    List<ProductCrawlingDTO> getGoodFood(String keyword) throws IOException; // 굿푸드몰

    List<ProductCrawlingDTO> getBabyleaf(String keyword) throws IOException; // 짱구몰

    List<ProductCrawlingDTO> getFoodEn(String keyword) throws IOException; // 푸드엔

    List<ProductCrawlingDTO> getMonoMart(String keyword) throws IOException;

//    List<ProductCrawlingDTO> getCheapestProduct(List<List<ProductCrawlingDTO>> aceList, List<List<ProductCrawlingDTO>> goodFoodList,
//                                          List<List<ProductCrawlingDTO>> babyleafList, List<List<ProductCrawlingDTO>> foodEnList,
//                                          List<List<ProductCrawlingDTO>> monoMartList) throws IOException;

}
