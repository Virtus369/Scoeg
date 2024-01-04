package com.virtus.demoBootstrap.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.virtus.demoBootstrap.entity.newsEntity;
import com.virtus.demoBootstrap.services.newsService;


@Controller
public class appPageController {
  
  @Autowired
  private newsService newsService;
  
  // 首頁
  @GetMapping("")
  public String viewHomePage() {
    return "index";
  }

  // 評分卡模組
  // 評分卡維護
  @GetMapping("/scList")
  public String viewScListPage() {
    return "scList";
  }

  // 簽核模組
  // 待簽核評分卡
  @GetMapping("/creditPage")
  public String viewCreditPage() {
    return "creditPage";
  }

  // 已簽核評分卡
  @GetMapping("/creditHistoryPage")
  public String viewCreditHistoryPage() {
    return "creditHistoryPage";
  }

  // 系統設定
  // 評分卡維護對應設定
  @GetMapping("/scmaPage")
  public String viewScmaPage() {
    return "scmaPage";
  }

  // 基本參數設定
  @GetMapping("/paramPage")
  public String viewParamPage() {
    return "paramPage";
  }

  // 衍生參數設定
  @GetMapping("/paramDerivaPage")
  public String viewParamDerivaPage() {
    return "paramDerivaPage";
  }

  // 系統別資料維護
  @GetMapping("/scoegSysPage")
  public String viewScoegSysPage() {
    return "scoegSysPage";
  }

  // 測試案列維護
  @GetMapping("/testDataPage")
  public String viewTestDataPage() {
    return "testDataPage";
  }

  // 評分卡匯入
  @GetMapping("/importFilePage")
  public String viewImportFilePage() {
    return "importFilePage";
  }

  // 報表
  // 評分卡異動查詢
  @GetMapping("/traceLogPage")
  public String viewTraceLogPage() {
    return "traceLogPage";
  }

  // 評分紀錄查詢
  @GetMapping("/scorePage")
  public String viewScorePage() {
    return "scorePage";
  }

  // 評分卡操作權限查詢
  @GetMapping("/scAuthPage")
  public String viewScAuthPage() {
    return "scAuthPage";
  }

  // 整批評分
  // 整批評分維護
  @GetMapping("/batchScoreListPage")
  public String viewBatchScoreListPagePage() {
    return "batchScoreListPage";
  }

  // 整批評分檔案維護
  @GetMapping("/uploadAttachFilePage")
  public String viewUploadAttachFilePage() {
    return "uploadAttachFilePage";
  }

  // 文件
  // 線上文件
  @GetMapping("/documentPage")
  public String viewDocumentPage() {
    return "documentPage";
  }

  // 系統管理
  // 系統參數維護
  @GetMapping("/systemProperties")
  public String viewSystemPropertiesPage() {
    return "systemProperties";
  }

  // 群組權限維護
  @GetMapping("/groupMaintainPage")
  public String viewGroupMaintainPage() {
    return "groupMaintainPage";
  }

  // 使用者維護
  // 使用者維護
  @GetMapping("/userMaintainPage")
  public String viewUserMaintainPage() {
    return "userMaintainPage";
  }

  // 線上使用者維護
  @GetMapping("/onlineUserMaintainPage")
  public String viewOnlineUserMaintainPage() {
    return "OnlineUserMaintainPage";
  }

  // 轉換代碼維護
  @GetMapping("/codesPage")
  public String viewCodesPage() {
    return "codesPage";
  }

  // 最新消息維護
  @GetMapping("/newsPage")
//  public String viewNewsPage() {
//    return "newsPage";
//  }
  public ModelAndView findAllNews() { 
    List<newsEntity> newsItems = newsService.findAllNews();
    ModelAndView mav = new ModelAndView("newsPage");
    mav.addObject("newsItems",newsItems);
    return mav;
  }

  // Mail通知維護
  @GetMapping("/mailPage")
  public String viewMailPage() {
    return "mailPage";
  }

  // WebServiceClient
  @GetMapping("/wsPage")
  public String viewWebServicePage() {
    return "wsPage";
  }

  // 日誌維護
  @GetMapping("/logManagementPage")
  public String viewlogManagementPage() {
    return "logManagementPage";
  }

  // Audit Log查詢
  @GetMapping("/logListPage")
  public String viewLoglistPage() {
    return "logListPage";
  }

  // Audit Log同步管理
  @GetMapping("/logSyncListPage")
  public String viewlogSyncListPage() {
    return "logSyncListPage";
  }

  // 休假異常交易紀錄
  @GetMapping("/nonDutyAccessPage")
  public String viewNonDutyAccessPage() {
    return "nonDutyAccessPage";
  }
  
  @GetMapping("/newsModal")
  public String showNewsModal() {
    return "newsModal";
  }
}
