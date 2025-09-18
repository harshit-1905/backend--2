package com.example.findR.entities;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "isPublicSiteAllowed",
        "isBrandUnificationEnabled",
        "enableProductSwap",
        "isPingToOktaPilotBrand",
        "useLogoForCrossRegistration",
        "canRedeemStatementCredit",
        "displayPhoneExtension",
        "isChipCardEnabled",
        "isHardshipEnabled",
        "suppressApplyInWelcomeSectionForActiveClient",
        "isDebitCardPaymentAllowed",
        "displayAccountAssureBanner",
        "isCardTypePrivateLabelDiscover",
        "showPublicBenefitsNavItem",
        "directDepositAccountRestrictionDays",
        "clientConversantOptions",
        "displayBreadFinancialFaqs",
        "enablePaperStatementFee",
        "showRewardsCardDetails",
        "enableAEM",
        "benefitsStyle",
        "secMsgPurgeDurationDays",
        "showMvcDigitalCard",
        "secMsgBodyCharLimit",
        "clientEnableCustomerFeedback",
        "secondary",
        "doesClientAllowAccountAssureOnApply",
        "paymentCutOffHour",
        "DIVTOO-paperlessDivInd",
        "isDerivedCardBRMasterCard",
        "isMobileAppEnabled",
        "isClientNameResolutionNeeded",
        "enableAugeoRewardsCatalog",
        "enableSecMsgAccountCenter",
        "breadMobileMedalliaFormIdiOS",
        "SecPagesInactivityExpSeconds",
        "enableACDROffers",
        "caStatusEligibleForPas",
        "isTerminatedClient",
        "paymentTimeZone",
        "ShowMvcAccountNumber",
        "balanceTransferMinAmount",
        "isCardTypeCoBrand",
        "smcAttachmentsNameLength",
        "showRewardsHeroCardArt",
        "showSecureBenefitsNavItem",
        "showRewardsHeroOption",
        "displayTransactionsTableOnSummary",
        "displayPublicCardmemberBenefits",
        "clientCardNumberPrefix",
        "isCardBusinessRevolving",
        "rewardsInfoRewardProgramType",
        "isInStoreApplicationAllowed",
        "isClientMigrated",
        "isCardTypePrivateLabel",
        "accountNumberValidationType",
        "isApplyVisibleDerived",
        "isDerivedPlasticCardDiscoverCoBrand",
        "isConfirmationRequired",
        "newClientName",
        "derivedRewardsCatalogURL",
        "canRedeemCatalog",
        "InactivityExpirationSeconds",
        "isAutoPayEnabled",
        "isPastDueAlertEligible",
        "cardTypeKey",
        "paymentCutOffMinutes",
        "accountAssureType",
        "clientDisputes",
        "shouldRedirectToNGAC",
        "derivedDisplayCardChoice",
        "terminationDate",
        "addntlLangSec",
        "derivedCardLockUnlockEnabled",
        "displayRewardsDowngradeGainStatusSection",
        "isVoiceOfCustomerPublicEnabled",
        "fraudResourceDirUrl",
        "derivedPrescreenCardChoice",
        "hasRewardsBackgroundArt",
        "hasCardChoiceLanding",
        "isUtilityNavVisible",
        "cardBrandKey",
        "clientCardName",
        "clientCardNumberMinLength",
        "isCardTypePrivateLabelWithCard",
        "isVoiceOfCustomerSecureEnabled",
        "clientHasIntegratedApplication",
        "displayNGACPublicBenefitsPage",
        "isPersonalizedCardEnabled",
        "maxPromoPlanDisplayInSummary",
        "enableClientCardActivation",
        "enableMyAlertsHistory",
        "enableCobrandOffers",
        "displayProgramDetailsTab",
        "showAuthBuyerRelationship",
        "doesClientAllowAccountAssure",
        "displayVerticalCardArt",
        "iconStyle",
        "headerStyle",
        "enableRewardsRedesign",
        "enablePrizeLogicRewardsCatalog",
        "isUpgradeCardAllowed",
        "cardCardless",
        "breadMobileIOSVersion",
        "hasRewardsNetworkBenefits",
        "SecPagesInactivityWarnSeconds",
        "DIVTOO-rewardDisplayInd",
        "enableACDRRewards",
        "DIVTOO-cardAcctType",
        "isDerivedPlasticCardMasterCardCoBrand",
        "DIVTOO-subAcctMax",
        "derivedPublicSite",
        "rewardAmountTier3",
        "paymentCutOffMinutesCollections",
        "rewardAmountTier2",
        "rewardAmountTier1",
        "breadMobileAndroidVersion",
        "breadMobileAndroidPlayStoreUrl",
        "clientApplePay",
        "clientGooglePay",
        "displaySummaryTab",
        "isCaptchaEnabled",
        "enableRewardsCertPresentment",
        "clientPayInStore",
        "isCardUPLCC",
        "DIVTOO-addntlLangInd",
        "hasMultipleEarningDetails",
        "InactivityWarningSeconds",
        "maxPayDaysOut",
        "DIVTOO-mobileComInd",
        "rewardsIcon",
        "isChatbotEnabled",
        "showCashAdvance",
        "isNFLBranded",
        "isDerivedPlasticCardVisaCoBrand",
        "clientDisplayOffersTab",
        "isSecMsgAttachmentsAllowed",
        "showPromoPlans",
        "showAutoPayOnAcctSummary",
        "enableMyAlerts",
        "showRewardsHeroDetailsLink",
        "isCellPhoneEnabled",
        "isRewardsCertPresentmentEnabled",
        "primary",
        "hasRewardsOffersProgramsEnabled",
        "derivedGranularControlsEnabled",
        "isBalanceTransferEnabled",
        "clientName",
        "isAuthOneClickBuyAllowed",
        "maxPayDaysOutCollections",
        "displayTerminationMessageInWelcomeSection",
        "isDerivedCardLessDiscoverCoBrand",
        "enableAddAuthBuyer",
        "isDerivedCardLessMasterCardCoBrand",
        "theme",
        "displayRewardsAmount",
        "displayRewardsLinkInWelcomeSection",
        "isSingleSignOnEnabled",
        "canToggleRewardsCurrency",
        "showRewardsActivityTable",
        "displayCreditLimitDesiredField",
        "smcAttachmentsMaxFiles",
        "clientPromoPlans",
        "enableRewardsBoostBonus",
        "suppressBenefitsInWelcomeSectionForActiveClient",
        "prioritizePublicHomeMarketingSpot",
        "isRewardsEnabled",
        "breadMobileMedalliaFormIdAndroid",
        "maxAuthBuyers",
        "caStatusEligibleForPtp",
        "hasPublicBackgroundArt",
        "isReageEnabled",
        "isCardTypePrivateLabelCardless",
        "enableRewardsAutoFulfillCertificates",
        "showFeaturedRewardsOffers",
        "cardBrand",
        "enablePaperlessStatements",
        "isDerivedCardLessVisaCoBrand",
        "canRedeemCashbackDirectDeposit",
        "isFiservGrayPeriod",
        "displayRegisterInWelcomeSection",
        "derivedLockRecurringChargesEnabled",
        "borderRadius",
        "DIVTOO-cycleTransferInd",
        "enableRewardsServiceCalls",
        "isConvertedToFiserv",
        "isCardless",
        "isTextServicingEnabled",
        "enableApplyOnline",
        "ShowMvcBarcode",
        "enablePacForHardship",
        "DIVTOO-cardlessInd",
        "cardProgramLaunchCountDownDays",
        "isCardBusinessRevolvingDiscover",
        "fraudHdmServiceUrl",
        "clientDivision",
        "isSecureSiteAllowed",
        "userActivityAuthRefine",
        "paymentCutOffHourCollections",
        "isHardshipAlertEligible",
        "enablePrizeLogicToEbboRewardsCatalog",
        "clientPromoPlanDaysRemaining",
        "isAuthBuyerAllowed",
        "isCreditLimitUpdateAllowed",
        "rewardsInfoRewardProgramIsMixedCurrency",
        "cardType",
        "breadMobileIOSAppStoreUrl",
        "DIVTOO-cardimInd",
        "enableNewClientName",
        "clientSamsungPay",
        "showRewardsHeroContentLarge",
        "showMenuIcons",
        "enableHTMLBanner",
        "isCardTypeCoBrandDiscover",
        "displayActivityTab",
        "displayCreditLimitIncomeField"
})
@Generated("jsonschema2pojo")
public class uatResponse {

    @JsonProperty("isPublicSiteAllowed")
    public Boolean isPublicSiteAllowed;
    @JsonProperty("isBrandUnificationEnabled")
    public Boolean isBrandUnificationEnabled;
    @JsonProperty("enableProductSwap")
    public Boolean enableProductSwap;
    @JsonProperty("isPingToOktaPilotBrand")
    public Boolean isPingToOktaPilotBrand;
    @JsonProperty("useLogoForCrossRegistration")
    public Boolean useLogoForCrossRegistration;
    @JsonProperty("canRedeemStatementCredit")
    public Boolean canRedeemStatementCredit;
    @JsonProperty("displayPhoneExtension")
    public Boolean displayPhoneExtension;
    @JsonProperty("isChipCardEnabled")
    public Boolean isChipCardEnabled;
    @JsonProperty("isHardshipEnabled")
    public Boolean isHardshipEnabled;
    @JsonProperty("suppressApplyInWelcomeSectionForActiveClient")
    public Boolean suppressApplyInWelcomeSectionForActiveClient;
    @JsonProperty("isDebitCardPaymentAllowed")
    public Boolean isDebitCardPaymentAllowed;
    @JsonProperty("displayAccountAssureBanner")
    public Boolean displayAccountAssureBanner;
    @JsonProperty("isCardTypePrivateLabelDiscover")
    public Boolean isCardTypePrivateLabelDiscover;
    @JsonProperty("showPublicBenefitsNavItem")
    public Boolean showPublicBenefitsNavItem;
    @JsonProperty("directDepositAccountRestrictionDays")
    public String directDepositAccountRestrictionDays;
    @JsonProperty("clientConversantOptions")
    public List<String> clientConversantOptions;
    @JsonProperty("displayBreadFinancialFaqs")
    public Boolean displayBreadFinancialFaqs;
    @JsonProperty("enablePaperStatementFee")
    public Boolean enablePaperStatementFee;
    @JsonProperty("showRewardsCardDetails")
    public Boolean showRewardsCardDetails;
    @JsonProperty("enableAEM")
    public Boolean enableAEM;
    @JsonProperty("benefitsStyle")
    public String benefitsStyle;
    @JsonProperty("secMsgPurgeDurationDays")
    public String secMsgPurgeDurationDays;
    @JsonProperty("showMvcDigitalCard")
    public Boolean showMvcDigitalCard;
    @JsonProperty("secMsgBodyCharLimit")
    public String secMsgBodyCharLimit;
    @JsonProperty("clientEnableCustomerFeedback")
    public String clientEnableCustomerFeedback;
    @JsonProperty("secondary")
    public String secondary;
    @JsonProperty("doesClientAllowAccountAssureOnApply")
    public Boolean doesClientAllowAccountAssureOnApply;
    @JsonProperty("paymentCutOffHour")
    public String paymentCutOffHour;
    @JsonProperty("DIVTOO-paperlessDivInd")
    public Boolean dIVTOOPaperlessDivInd;
    @JsonProperty("isDerivedCardBRMasterCard")
    public Boolean isDerivedCardBRMasterCard;
    @JsonProperty("isMobileAppEnabled")
    public Boolean isMobileAppEnabled;
    @JsonProperty("isClientNameResolutionNeeded")
    public Boolean isClientNameResolutionNeeded;
    @JsonProperty("enableAugeoRewardsCatalog")
    public Boolean enableAugeoRewardsCatalog;
    @JsonProperty("enableSecMsgAccountCenter")
    public Boolean enableSecMsgAccountCenter;
    @JsonProperty("breadMobileMedalliaFormIdiOS")
    public String breadMobileMedalliaFormIdiOS;
    @JsonProperty("SecPagesInactivityExpSeconds")
    public String secPagesInactivityExpSeconds;
    @JsonProperty("enableACDROffers")
    public Boolean enableACDROffers;
    @JsonProperty("caStatusEligibleForPas")
    public List<String> caStatusEligibleForPas;
    @JsonProperty("isTerminatedClient")
    public Boolean isTerminatedClient;
    @JsonProperty("paymentTimeZone")
    public String paymentTimeZone;
    @JsonProperty("ShowMvcAccountNumber")
    public Boolean showMvcAccountNumber;
    @JsonProperty("balanceTransferMinAmount")
    public String balanceTransferMinAmount;
    @JsonProperty("isCardTypeCoBrand")
    public Boolean isCardTypeCoBrand;
    @JsonProperty("smcAttachmentsNameLength")
    public String smcAttachmentsNameLength;
    @JsonProperty("showRewardsHeroCardArt")
    public Boolean showRewardsHeroCardArt;
    @JsonProperty("showSecureBenefitsNavItem")
    public Boolean showSecureBenefitsNavItem;
    @JsonProperty("showRewardsHeroOption")
    public List<String> showRewardsHeroOption;
    @JsonProperty("displayTransactionsTableOnSummary")
    public Boolean displayTransactionsTableOnSummary;
    @JsonProperty("displayPublicCardmemberBenefits")
    public Boolean displayPublicCardmemberBenefits;
    @JsonProperty("clientCardNumberPrefix")
    public String clientCardNumberPrefix;
    @JsonProperty("isCardBusinessRevolving")
    public Boolean isCardBusinessRevolving;
    @JsonProperty("rewardsInfoRewardProgramType")
    public List<String> rewardsInfoRewardProgramType;
    @JsonProperty("isInStoreApplicationAllowed")
    public Boolean isInStoreApplicationAllowed;
    @JsonProperty("isClientMigrated")
    public Boolean isClientMigrated;
    @JsonProperty("isCardTypePrivateLabel")
    public Boolean isCardTypePrivateLabel;
    @JsonProperty("accountNumberValidationType")
    public String accountNumberValidationType;
    @JsonProperty("isApplyVisibleDerived")
    public Boolean isApplyVisibleDerived;
    @JsonProperty("isDerivedPlasticCardDiscoverCoBrand")
    public Boolean isDerivedPlasticCardDiscoverCoBrand;
    @JsonProperty("isConfirmationRequired")
    public Boolean isConfirmationRequired;
    @JsonProperty("newClientName")
    public String newClientName;
    @JsonProperty("derivedRewardsCatalogURL")
    public String derivedRewardsCatalogURL;
    @JsonProperty("canRedeemCatalog")
    public Boolean canRedeemCatalog;
    @JsonProperty("InactivityExpirationSeconds")
    public String inactivityExpirationSeconds;
    @JsonProperty("isAutoPayEnabled")
    public Boolean isAutoPayEnabled;
    @JsonProperty("isPastDueAlertEligible")
    public Boolean isPastDueAlertEligible;
    @JsonProperty("cardTypeKey")
    public String cardTypeKey;
    @JsonProperty("paymentCutOffMinutes")
    public String paymentCutOffMinutes;
    @JsonProperty("accountAssureType")
    public List<String> accountAssureType;
    @JsonProperty("clientDisputes")
    public Boolean clientDisputes;
    @JsonProperty("shouldRedirectToNGAC")
    public Boolean shouldRedirectToNGAC;
    @JsonProperty("derivedDisplayCardChoice")
    public Boolean derivedDisplayCardChoice;
    @JsonProperty("terminationDate")
    public String terminationDate;
    @JsonProperty("addntlLangSec")
    public Boolean addntlLangSec;
    @JsonProperty("derivedCardLockUnlockEnabled")
    public Boolean derivedCardLockUnlockEnabled;
    @JsonProperty("displayRewardsDowngradeGainStatusSection")
    public Boolean displayRewardsDowngradeGainStatusSection;
    @JsonProperty("isVoiceOfCustomerPublicEnabled")
    public Boolean isVoiceOfCustomerPublicEnabled;
    @JsonProperty("fraudResourceDirUrl")
    public String fraudResourceDirUrl;
    @JsonProperty("derivedPrescreenCardChoice")
    public Boolean derivedPrescreenCardChoice;
    @JsonProperty("hasRewardsBackgroundArt")
    public Boolean hasRewardsBackgroundArt;
    @JsonProperty("hasCardChoiceLanding")
    public Boolean hasCardChoiceLanding;
    @JsonProperty("isUtilityNavVisible")
    public Boolean isUtilityNavVisible;
    @JsonProperty("cardBrandKey")
    public String cardBrandKey;
    @JsonProperty("clientCardName")
    public String clientCardName;
    @JsonProperty("clientCardNumberMinLength")
    public String clientCardNumberMinLength;
    @JsonProperty("isCardTypePrivateLabelWithCard")
    public Boolean isCardTypePrivateLabelWithCard;
    @JsonProperty("isVoiceOfCustomerSecureEnabled")
    public Boolean isVoiceOfCustomerSecureEnabled;
    @JsonProperty("clientHasIntegratedApplication")
    public Boolean clientHasIntegratedApplication;
    @JsonProperty("displayNGACPublicBenefitsPage")
    public Boolean displayNGACPublicBenefitsPage;
    @JsonProperty("isPersonalizedCardEnabled")
    public Boolean isPersonalizedCardEnabled;
    @JsonProperty("maxPromoPlanDisplayInSummary")
    public String maxPromoPlanDisplayInSummary;
    @JsonProperty("enableClientCardActivation")
    public Boolean enableClientCardActivation;
    @JsonProperty("enableMyAlertsHistory")
    public Boolean enableMyAlertsHistory;
    @JsonProperty("enableCobrandOffers")
    public Boolean enableCobrandOffers;
    @JsonProperty("displayProgramDetailsTab")
    public Boolean displayProgramDetailsTab;
    @JsonProperty("showAuthBuyerRelationship")
    public Boolean showAuthBuyerRelationship;
    @JsonProperty("doesClientAllowAccountAssure")
    public Boolean doesClientAllowAccountAssure;
    @JsonProperty("displayVerticalCardArt")
    public Boolean displayVerticalCardArt;
    @JsonProperty("iconStyle")
    public List<String> iconStyle;
    @JsonProperty("headerStyle")
    public List<String> headerStyle;
    @JsonProperty("enableRewardsRedesign")
    public Boolean enableRewardsRedesign;
    @JsonProperty("enablePrizeLogicRewardsCatalog")
    public Boolean enablePrizeLogicRewardsCatalog;
    @JsonProperty("isUpgradeCardAllowed")
    public Boolean isUpgradeCardAllowed;
    @JsonProperty("cardCardless")
    public Boolean cardCardless;
    @JsonProperty("breadMobileIOSVersion")
    public String breadMobileIOSVersion;
    @JsonProperty("hasRewardsNetworkBenefits")
    public Boolean hasRewardsNetworkBenefits;
    @JsonProperty("SecPagesInactivityWarnSeconds")
    public String secPagesInactivityWarnSeconds;
    @JsonProperty("DIVTOO-rewardDisplayInd")
    public Boolean dIVTOORewardDisplayInd;
    @JsonProperty("enableACDRRewards")
    public Boolean enableACDRRewards;
    @JsonProperty("DIVTOO-cardAcctType")
    public String dIVTOOCardAcctType;
    @JsonProperty("isDerivedPlasticCardMasterCardCoBrand")
    public Boolean isDerivedPlasticCardMasterCardCoBrand;
    @JsonProperty("DIVTOO-subAcctMax")
    public String dIVTOOSubAcctMax;
    @JsonProperty("derivedPublicSite")
    public String derivedPublicSite;
    @JsonProperty("rewardAmountTier3")
    public String rewardAmountTier3;
    @JsonProperty("paymentCutOffMinutesCollections")
    public String paymentCutOffMinutesCollections;
    @JsonProperty("rewardAmountTier2")
    public String rewardAmountTier2;
    @JsonProperty("rewardAmountTier1")
    public String rewardAmountTier1;
    @JsonProperty("breadMobileAndroidVersion")
    public String breadMobileAndroidVersion;
    @JsonProperty("breadMobileAndroidPlayStoreUrl")
    public String breadMobileAndroidPlayStoreUrl;
    @JsonProperty("clientApplePay")
    public String clientApplePay;
    @JsonProperty("clientGooglePay")
    public String clientGooglePay;
    @JsonProperty("displaySummaryTab")
    public Boolean displaySummaryTab;
    @JsonProperty("isCaptchaEnabled")
    public Boolean isCaptchaEnabled;
    @JsonProperty("enableRewardsCertPresentment")
    public Boolean enableRewardsCertPresentment;
    @JsonProperty("clientPayInStore")
    public Boolean clientPayInStore;
    @JsonProperty("isCardUPLCC")
    public Boolean isCardUPLCC;
    @JsonProperty("DIVTOO-addntlLangInd")
    public Boolean dIVTOOAddntlLangInd;
    @JsonProperty("hasMultipleEarningDetails")
    public Boolean hasMultipleEarningDetails;
    @JsonProperty("InactivityWarningSeconds")
    public String inactivityWarningSeconds;
    @JsonProperty("maxPayDaysOut")
    public String maxPayDaysOut;
    @JsonProperty("DIVTOO-mobileComInd")
    public String dIVTOOMobileComInd;
    @JsonProperty("rewardsIcon")
    public List<String> rewardsIcon;
    @JsonProperty("isChatbotEnabled")
    public Boolean isChatbotEnabled;
    @JsonProperty("showCashAdvance")
    public Boolean showCashAdvance;
    @JsonProperty("isNFLBranded")
    public Boolean isNFLBranded;
    @JsonProperty("isDerivedPlasticCardVisaCoBrand")
    public Boolean isDerivedPlasticCardVisaCoBrand;
    @JsonProperty("clientDisplayOffersTab")
    public Boolean clientDisplayOffersTab;
    @JsonProperty("isSecMsgAttachmentsAllowed")
    public Boolean isSecMsgAttachmentsAllowed;
    @JsonProperty("showPromoPlans")
    public Boolean showPromoPlans;
    @JsonProperty("showAutoPayOnAcctSummary")
    public Boolean showAutoPayOnAcctSummary;
    @JsonProperty("enableMyAlerts")
    public Boolean enableMyAlerts;
    @JsonProperty("showRewardsHeroDetailsLink")
    public Boolean showRewardsHeroDetailsLink;
    @JsonProperty("isCellPhoneEnabled")
    public Boolean isCellPhoneEnabled;
    @JsonProperty("isRewardsCertPresentmentEnabled")
    public Boolean isRewardsCertPresentmentEnabled;
    @JsonProperty("primary")
    public String primary;
    @JsonProperty("hasRewardsOffersProgramsEnabled")
    public Boolean hasRewardsOffersProgramsEnabled;
    @JsonProperty("derivedGranularControlsEnabled")
    public Boolean derivedGranularControlsEnabled;
    @JsonProperty("isBalanceTransferEnabled")
    public Boolean isBalanceTransferEnabled;
    @JsonProperty("clientName")
    public String clientName;
    @JsonProperty("isAuthOneClickBuyAllowed")
    public Boolean isAuthOneClickBuyAllowed;
    @JsonProperty("maxPayDaysOutCollections")
    public String maxPayDaysOutCollections;
    @JsonProperty("displayTerminationMessageInWelcomeSection")
    public Boolean displayTerminationMessageInWelcomeSection;
    @JsonProperty("isDerivedCardLessDiscoverCoBrand")
    public Boolean isDerivedCardLessDiscoverCoBrand;
    @JsonProperty("enableAddAuthBuyer")
    public Boolean enableAddAuthBuyer;
    @JsonProperty("isDerivedCardLessMasterCardCoBrand")
    public Boolean isDerivedCardLessMasterCardCoBrand;
    @JsonProperty("theme")
    public List<String> theme;
    @JsonProperty("displayRewardsAmount")
    public Boolean displayRewardsAmount;
    @JsonProperty("displayRewardsLinkInWelcomeSection")
    public Boolean displayRewardsLinkInWelcomeSection;
    @JsonProperty("isSingleSignOnEnabled")
    public Boolean isSingleSignOnEnabled;
    @JsonProperty("canToggleRewardsCurrency")
    public Boolean canToggleRewardsCurrency;
    @JsonProperty("showRewardsActivityTable")
    public Boolean showRewardsActivityTable;
    @JsonProperty("displayCreditLimitDesiredField")
    public Boolean displayCreditLimitDesiredField;
    @JsonProperty("smcAttachmentsMaxFiles")
    public String smcAttachmentsMaxFiles;
    @JsonProperty("clientPromoPlans")
    public List<String> clientPromoPlans;
    @JsonProperty("enableRewardsBoostBonus")
    public Boolean enableRewardsBoostBonus;
    @JsonProperty("suppressBenefitsInWelcomeSectionForActiveClient")
    public Boolean suppressBenefitsInWelcomeSectionForActiveClient;
    @JsonProperty("prioritizePublicHomeMarketingSpot")
    public Boolean prioritizePublicHomeMarketingSpot;
    @JsonProperty("isRewardsEnabled")
    public Boolean isRewardsEnabled;
    @JsonProperty("breadMobileMedalliaFormIdAndroid")
    public String breadMobileMedalliaFormIdAndroid;
    @JsonProperty("maxAuthBuyers")
    public String maxAuthBuyers;
    @JsonProperty("caStatusEligibleForPtp")
    public List<String> caStatusEligibleForPtp;
    @JsonProperty("hasPublicBackgroundArt")
    public Boolean hasPublicBackgroundArt;
    @JsonProperty("isReageEnabled")
    public Boolean isReageEnabled;
    @JsonProperty("isCardTypePrivateLabelCardless")
    public Boolean isCardTypePrivateLabelCardless;
    @JsonProperty("enableRewardsAutoFulfillCertificates")
    public Boolean enableRewardsAutoFulfillCertificates;
    @JsonProperty("showFeaturedRewardsOffers")
    public Boolean showFeaturedRewardsOffers;
    @JsonProperty("cardBrand")
    public String cardBrand;
    @JsonProperty("enablePaperlessStatements")
    public Boolean enablePaperlessStatements;
    @JsonProperty("isDerivedCardLessVisaCoBrand")
    public Boolean isDerivedCardLessVisaCoBrand;
    @JsonProperty("canRedeemCashbackDirectDeposit")
    public Boolean canRedeemCashbackDirectDeposit;
    @JsonProperty("isFiservGrayPeriod")
    public Boolean isFiservGrayPeriod;
    @JsonProperty("displayRegisterInWelcomeSection")
    public Boolean displayRegisterInWelcomeSection;
    @JsonProperty("derivedLockRecurringChargesEnabled")
    public Boolean derivedLockRecurringChargesEnabled;
    @JsonProperty("borderRadius")
    public Boolean borderRadius;
    @JsonProperty("DIVTOO-cycleTransferInd")
    public Boolean dIVTOOCycleTransferInd;
    @JsonProperty("enableRewardsServiceCalls")
    public Boolean enableRewardsServiceCalls;
    @JsonProperty("isConvertedToFiserv")
    public Boolean isConvertedToFiserv;
    @JsonProperty("isCardless")
    public Boolean isCardless;
    @JsonProperty("isTextServicingEnabled")
    public Boolean isTextServicingEnabled;
    @JsonProperty("enableApplyOnline")
    public Boolean enableApplyOnline;
    @JsonProperty("ShowMvcBarcode")
    public Boolean showMvcBarcode;
    @JsonProperty("enablePacForHardship")
    public Boolean enablePacForHardship;
    @JsonProperty("DIVTOO-cardlessInd")
    public Boolean dIVTOOCardlessInd;
    @JsonProperty("cardProgramLaunchCountDownDays")
    public String cardProgramLaunchCountDownDays;
    @JsonProperty("isCardBusinessRevolvingDiscover")
    public Boolean isCardBusinessRevolvingDiscover;
    @JsonProperty("fraudHdmServiceUrl")
    public String fraudHdmServiceUrl;
    @JsonProperty("clientDivision")
    public String clientDivision;
    @JsonProperty("isSecureSiteAllowed")
    public Boolean isSecureSiteAllowed;
    @JsonProperty("userActivityAuthRefine")
    public String userActivityAuthRefine;
    @JsonProperty("paymentCutOffHourCollections")
    public String paymentCutOffHourCollections;
    @JsonProperty("isHardshipAlertEligible")
    public Boolean isHardshipAlertEligible;
    @JsonProperty("enablePrizeLogicToEbboRewardsCatalog")
    public Boolean enablePrizeLogicToEbboRewardsCatalog;
    @JsonProperty("clientPromoPlanDaysRemaining")
    public String clientPromoPlanDaysRemaining;
    @JsonProperty("isAuthBuyerAllowed")
    public Boolean isAuthBuyerAllowed;
    @JsonProperty("isCreditLimitUpdateAllowed")
    public Boolean isCreditLimitUpdateAllowed;
    @JsonProperty("rewardsInfoRewardProgramIsMixedCurrency")
    public Boolean rewardsInfoRewardProgramIsMixedCurrency;
    @JsonProperty("cardType")
    public String cardType;
    @JsonProperty("breadMobileIOSAppStoreUrl")
    public String breadMobileIOSAppStoreUrl;
    @JsonProperty("DIVTOO-cardimInd")
    public Boolean dIVTOOCardimInd;
    @JsonProperty("enableNewClientName")
    public Boolean enableNewClientName;
    @JsonProperty("clientSamsungPay")
    public String clientSamsungPay;
    @JsonProperty("showRewardsHeroContentLarge")
    public Boolean showRewardsHeroContentLarge;
    @JsonProperty("showMenuIcons")
    public Boolean showMenuIcons;
    @JsonProperty("enableHTMLBanner")
    public Boolean enableHTMLBanner;
    @JsonProperty("isCardTypeCoBrandDiscover")
    public Boolean isCardTypeCoBrandDiscover;
    @JsonProperty("displayActivityTab")
    public Boolean displayActivityTab;
    @JsonProperty("displayCreditLimitIncomeField")
    public Boolean displayCreditLimitIncomeField;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}