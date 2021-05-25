package com.gm.momentum.entiry;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
public class Project {
//    public String pROJID;
//    public String pROJNM;
//    public String pGMCD;
//    public String mODELYR;
//    public String pROJTYPE;
//    public String aRCH;
//    public String gPDSSUBSYS;
//    public String lEADARCHREGION;
//    public String lEADDSGNREGION;
//    public String lEADENGREGION;
//    public String lEADMFGREGION;
//    public Object lEADMKTGREGION;
//    public String pROJSTAT;
//    public String mRDIEBBDT;
//    public String sASPC65DT;
//    public String mRDIVGADT;
//    public String vDBOR65DT;
//    public String sASPC80DT;
//    public String mRDFEBBDT;
//    public String vDBOR80DT;
//    public String cALIBCOMP99DT;
//    public String sASPC100DT;
//    public String vDBOR100DT;
//    public String vTCDT;
//    public String pPAPGATEDT;
//    public String vDCDT;
//    public String sORPDT;
//    public String pPVBUILDDT;
//    public String vPIDT;
//    public String sASPC99DT;
//    public String aPPVBIW;
//    public String aPPVGADT;
//    public String fIVC;
//    public String fPPVA;
//    public String mVBNS;
//    public String mRDGA;
//    public String pQQRDORP;
//    public String vESCOM65;
//    public String vESCOM80;
//    public String vESCOM99;
//    public String vESCOM100;
//    public String vESCOMRPR;
//    public String fAPPVA;
//    public String cRTID;
//    public String cRTTS;
//    public String uPDID;
//    public String uPDTS;
	@JsonProperty("PROJ_ID") 
    public String pROJ_ID;
    @JsonProperty("PROJ_NM") 
    public String pROJ_NM;
    @JsonProperty("PGM_CD") 
    public String pGM_CD;
    @JsonProperty("MODEL_YR") 
    public String mODEL_YR;
    @JsonProperty("PROJ_TYPE") 
    public String pROJ_TYPE;
    @JsonProperty("ARCH") 
    public String aRCH;
    @JsonProperty("GPDS_SUBSYS") 
    public String gPDS_SUBSYS;
    @JsonProperty("LEAD_ARCH_REGION") 
    public String lEAD_ARCH_REGION;
    @JsonProperty("LEAD_DSGN_REGION") 
    public String lEAD_DSGN_REGION;
    @JsonProperty("LEAD_ENG_REGION") 
    public String lEAD_ENG_REGION;
    @JsonProperty("LEAD_MFG_REGION") 
    public String lEAD_MFG_REGION;
    @JsonProperty("LEAD_MKTG_REGION") 
    public Object lEAD_MKTG_REGION;
    @JsonProperty("PROJ_STAT") 
    public String pROJ_STAT;
    @JsonProperty("MRD_IEBB_DT") 
    public String mRD_IEBB_DT;
    @JsonProperty("SASPC65_DT") 
    public String sASPC65_DT;
    @JsonProperty("MRD_IVGA_DT") 
    public String mRD_IVGA_DT;
    @JsonProperty("VDBOR65_DT") 
    public String vDBOR65_DT;
    @JsonProperty("SASPC80_DT") 
    public String sASPC80_DT;
    @JsonProperty("MRD_FEBB_DT") 
    public String mRD_FEBB_DT;
    @JsonProperty("VDBOR80_DT") 
    public String vDBOR80_DT;
    @JsonProperty("CALIBCOMP99_DT") 
    public String cALIBCOMP99_DT;
    @JsonProperty("SASPC100_DT") 
    public String sASPC100_DT;
    @JsonProperty("VDBOR100_DT") 
    public String vDBOR100_DT;
    @JsonProperty("VTC_DT") 
    public String vTC_DT;
    @JsonProperty("PPAPGATE_DT") 
    public String pPAPGATE_DT;
    @JsonProperty("VDC_DT") 
    public String vDC_DT;
    @JsonProperty("SORP_DT") 
    public String sORP_DT;
    @JsonProperty("PPVBUILD_DT") 
    public String pPVBUILD_DT;
    @JsonProperty("VPI_DT") 
    public String vPI_DT;
    @JsonProperty("SASPC99_DT") 
    public String sASPC99_DT;
    @JsonProperty("APPV_BIW") 
    public String aPPV_BIW;
    @JsonProperty("APPV_GA_DT") 
    public String aPPV_GA_DT;
    @JsonProperty("FIVC") 
    public String fIVC;
    @JsonProperty("FPPVA") 
    public String fPPVA;
    @JsonProperty("MVB_NS") 
    public String mVB_NS;
    @JsonProperty("MRD_GA") 
    public String mRD_GA;
    @JsonProperty("PQQR_DORP") 
    public String pQQR_DORP;
    @JsonProperty("VESCOM_65") 
    public String vESCOM_65;
    @JsonProperty("VESCOM_80") 
    public String vESCOM_80;
    @JsonProperty("VESCOM_99") 
    public String vESCOM_99;
    @JsonProperty("VESCOM_100") 
    public String vESCOM_100;
    @JsonProperty("VESCOM_RPR") 
    public String vESCOM_RPR;
    @JsonProperty("FAPPVA") 
    public String fAPPVA;
    @JsonProperty("CRT_ID") 
    public String cRT_ID;
    @JsonProperty("CRT_TS") 
    public String cRT_TS;
    @JsonProperty("UPD_ID") 
    public String uPD_ID;
    @JsonProperty("UPD_TS") 
    public String uPD_TS;
}
