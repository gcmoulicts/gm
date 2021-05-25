package com.gm.momentum.util;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gm.momentum.entiry.Project;

public class StaticDataUtil {

	public static final String T1UCF = "{" + 
			"  \"count\": 3," + 
			"  \"metadata\": {" + 
			"    \"PROJ_ID\": \"VARCHAR2\"," + 
			"    \"PROJ_NM\": \"VARCHAR2\"," + 
			"    \"PGM_CD\": \"VARCHAR2\"," + 
			"    \"MODEL_YR\": \"VARCHAR2\"," + 
			"    \"PROJ_TYPE\": \"VARCHAR2\"," + 
			"    \"ARCH\": \"VARCHAR2\"," + 
			"    \"GPDS_SUBSYS\": \"VARCHAR2\"," + 
			"    \"LEAD_ARCH_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_DSGN_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_ENG_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_MFG_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_MKTG_REGION\": \"VARCHAR2\"," + 
			"    \"PROJ_STAT\": \"VARCHAR2\"," + 
			"    \"MRD_IEBB_DT\": \"DATE\"," + 
			"    \"SASPC65_DT\": \"DATE\"," + 
			"    \"MRD_IVGA_DT\": \"DATE\"," + 
			"    \"VDBOR65_DT\": \"DATE\"," + 
			"    \"SASPC80_DT\": \"DATE\"," + 
			"    \"MRD_FEBB_DT\": \"DATE\"," + 
			"    \"VDBOR80_DT\": \"DATE\"," + 
			"    \"CALIBCOMP99_DT\": \"DATE\"," + 
			"    \"SASPC100_DT\": \"DATE\"," + 
			"    \"VDBOR100_DT\": \"DATE\"," + 
			"    \"VTC_DT\": \"DATE\"," + 
			"    \"PPAPGATE_DT\": \"DATE\"," + 
			"    \"VDC_DT\": \"DATE\"," + 
			"    \"SORP_DT\": \"DATE\"," + 
			"    \"PPVBUILD_DT\": \"DATE\"," + 
			"    \"VPI_DT\": \"DATE\"," + 
			"    \"SASPC99_DT\": \"DATE\"," + 
			"    \"APPV_BIW\": \"DATE\"," + 
			"    \"APPV_GA_DT\": \"DATE\"," + 
			"    \"FIVC\": \"DATE\"," + 
			"    \"FPPVA\": \"DATE\"," + 
			"    \"MVB_NS\": \"DATE\"," + 
			"    \"MRD_GA\": \"DATE\"," + 
			"    \"PQQR_DORP\": \"DATE\"," + 
			"    \"VESCOM_65\": \"DATE\"," + 
			"    \"VESCOM_80\": \"DATE\"," + 
			"    \"VESCOM_99\": \"DATE\"," + 
			"    \"VESCOM_100\": \"DATE\"," + 
			"    \"VESCOM_RPR\": \"DATE\"," + 
			"    \"FAPPVA\": \"DATE\"," + 
			"    \"CRT_ID\": \"VARCHAR2\"," + 
			"    \"CRT_TS\": \"TIMESTAMP\"," + 
			"    \"UPD_ID\": \"VARCHAR2\"," + 
			"    \"UPD_TS\": \"TIMESTAMP\"" + 
			"  }," + 
			"  \"items\": [" + 
			"    {" + 
			"      \"PROJ_ID\": \"289727174\"," + 
			"      \"PROJ_NM\": \"2021 T1UCF/T1UGF\"," + 
			"      \"PGM_CD\": \"T1UCF/T1UGF\"," + 
			"      \"MODEL_YR\": \"2021\"," + 
			"      \"PROJ_TYPE\": \"Major\"," + 
			"      \"ARCH\": \"Truck\"," + 
			"      \"GPDS_SUBSYS\": \"P - Program Plan\"," + 
			"      \"LEAD_ARCH_REGION\": \"GMNA\"," + 
			"      \"LEAD_DSGN_REGION\": \"GMNA\"," + 
			"      \"LEAD_ENG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MFG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MKTG_REGION\": null," + 
			"      \"PROJ_STAT\": \"Approved\"," + 
			"      \"MRD_IEBB_DT\": \"2017-11-29 00:00:00\"," + 
			"      \"SASPC65_DT\": \"2018-04-11 00:00:00\"," + 
			"      \"MRD_IVGA_DT\": \"2018-04-09 00:00:00\"," + 
			"      \"VDBOR65_DT\": \"2018-09-14 00:00:00\"," + 
			"      \"SASPC80_DT\": \"2018-11-02 00:00:00\"," + 
			"      \"MRD_FEBB_DT\": \"2019-02-11 00:00:00\"," + 
			"      \"VDBOR80_DT\": \"2019-03-01 00:00:00\"," + 
			"      \"CALIBCOMP99_DT\": \"2019-04-19 00:00:00\"," + 
			"      \"SASPC100_DT\": \"2019-06-14 00:00:00\"," + 
			"      \"VDBOR100_DT\": \"2019-08-09 00:00:00\"," + 
			"      \"VTC_DT\": \"2019-08-19 00:00:00\"," + 
			"      \"PPAPGATE_DT\": \"2019-10-11 00:00:00\"," + 
			"      \"VDC_DT\": \"2019-09-30 00:00:00\"," + 
			"      \"SORP_DT\": \"2020-04-20 00:00:00\"," + 
			"      \"PPVBUILD_DT\": \"2019-08-23 00:00:00\"," + 
			"      \"VPI_DT\": \"2016-12-19 00:00:00\"," + 
			"      \"SASPC99_DT\": \"2019-02-11 00:00:00\"," + 
			"      \"APPV_BIW\": \"2019-02-22 00:00:00\"," + 
			"      \"APPV_GA_DT\": \"2019-02-15 00:00:00\"," + 
			"      \"FIVC\": \"2018-05-15 00:00:00\"," + 
			"      \"FPPVA\": \"2019-05-31 00:00:00\"," + 
			"      \"MVB_NS\": \"2019-08-16 00:00:00\"," + 
			"      \"MRD_GA\": \"2019-10-25 00:00:00\"," + 
			"      \"PQQR_DORP\": \"2020-04-13 00:00:00\"," + 
			"      \"VESCOM_65\": \"2018-09-07 00:00:00\"," + 
			"      \"VESCOM_80\": \"2019-02-15 00:00:00\"," + 
			"      \"VESCOM_99\": \"2019-04-26 00:00:00\"," + 
			"      \"VESCOM_100\": \"2019-07-05 00:00:00\"," + 
			"      \"VESCOM_RPR\": \"2019-11-08 00:00:00\"," + 
			"      \"FAPPVA\": \"2019-03-25 00:00:00\"," + 
			"      \"CRT_ID\": \"BATCH\"," + 
			"      \"CRT_TS\": \"2020-10-08 22:40:37\"," + 
			"      \"UPD_ID\": \"BATCH\"," + 
			"      \"UPD_TS\": \"2020-10-08 22:40:37\"" + 
			"    }," + 
			"    {" + 
			"      \"PROJ_ID\": \"450000500\"," + 
			"      \"PROJ_NM\": \"2021 T1UCF 9C1\"," + 
			"      \"PGM_CD\": \"T1UCF\"," + 
			"      \"MODEL_YR\": \"2021\"," + 
			"      \"PROJ_TYPE\": \"S\"," + 
			"      \"ARCH\": \"Truck\"," + 
			"      \"GPDS_SUBSYS\": \"P - Program Plan\"," + 
			"      \"LEAD_ARCH_REGION\": \"GMNA\"," + 
			"      \"LEAD_DSGN_REGION\": \"GMNA\"," + 
			"      \"LEAD_ENG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MFG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MKTG_REGION\": \"GMNA\"," + 
			"      \"PROJ_STAT\": \"Approved\"," + 
			"      \"MRD_IEBB_DT\": null," + 
			"      \"SASPC65_DT\": null," + 
			"      \"MRD_IVGA_DT\": \"2019-02-04 00:00:00\"," + 
			"      \"VDBOR65_DT\": \"2019-06-14 00:00:00\"," + 
			"      \"SASPC80_DT\": null," + 
			"      \"MRD_FEBB_DT\": null," + 
			"      \"VDBOR80_DT\": \"2019-11-22 00:00:00\"," + 
			"      \"CALIBCOMP99_DT\": \"2020-01-10 00:00:00\"," + 
			"      \"SASPC100_DT\": \"2020-03-06 00:00:00\"," + 
			"      \"VDBOR100_DT\": \"2020-04-03 00:00:00\"," + 
			"      \"VTC_DT\": \"2020-05-04 00:00:00\"," + 
			"      \"PPAPGATE_DT\": \"2020-06-26 00:00:00\"," + 
			"      \"VDC_DT\": \"2020-06-12 00:00:00\"," + 
			"      \"SORP_DT\": \"2020-11-02 00:00:00\"," + 
			"      \"PPVBUILD_DT\": \"2020-05-08 00:00:00\"," + 
			"      \"VPI_DT\": null," + 
			"      \"SASPC99_DT\": null," + 
			"      \"APPV_BIW\": null," + 
			"      \"APPV_GA_DT\": null," + 
			"      \"FIVC\": \"2019-03-08 00:00:00\"," + 
			"      \"FPPVA\": \"2020-03-13 00:00:00\"," + 
			"      \"MVB_NS\": \"2020-05-01 00:00:00\"," + 
			"      \"MRD_GA\": \"2020-07-10 00:00:00\"," + 
			"      \"PQQR_DORP\": \"2020-10-26 00:00:00\"," + 
			"      \"VESCOM_65\": null," + 
			"      \"VESCOM_80\": null," + 
			"      \"VESCOM_99\": null," + 
			"      \"VESCOM_100\": \"2020-03-20 00:00:00\"," + 
			"      \"VESCOM_RPR\": \"2020-07-24 00:00:00\"," + 
			"      \"FAPPVA\": null," + 
			"      \"CRT_ID\": \"BATCH\"," + 
			"      \"CRT_TS\": \"2020-10-08 22:40:17\"," + 
			"      \"UPD_ID\": \"BATCH\"," + 
			"      \"UPD_TS\": \"2020-10-08 22:40:17\"" + 
			"    }," + 
			"    {" + 
			"      \"PROJ_ID\": \"504285860-1\"," + 
			"      \"PROJ_NM\": \"2021 T1UX NA E/I\"," + 
			"      \"PGM_CD\": \"T1UCF | T1ULF\"," + 
			"      \"MODEL_YR\": \"2021\"," + 
			"      \"PROJ_TYPE\": \"S\"," + 
			"      \"ARCH\": \"Truck\"," + 
			"      \"GPDS_SUBSYS\": \"P - Program Plan\"," + 
			"      \"LEAD_ARCH_REGION\": \"GMNA\"," + 
			"      \"LEAD_DSGN_REGION\": \"GMNA\"," + 
			"      \"LEAD_ENG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MFG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MKTG_REGION\": \"GMNA\"," + 
			"      \"PROJ_STAT\": \"Proposed\"," + 
			"      \"MRD_IEBB_DT\": null," + 
			"      \"SASPC65_DT\": null," + 
			"      \"MRD_IVGA_DT\": null," + 
			"      \"VDBOR65_DT\": \"2019-08-30 00:00:00\"," + 
			"      \"SASPC80_DT\": \"2019-11-01 00:00:00\"," + 
			"      \"MRD_FEBB_DT\": \"2020-01-20 00:00:00\"," + 
			"      \"VDBOR80_DT\": \"2020-02-07 00:00:00\"," + 
			"      \"CALIBCOMP99_DT\": \"2020-03-27 00:00:00\"," + 
			"      \"SASPC100_DT\": \"2020-05-29 00:00:00\"," + 
			"      \"VDBOR100_DT\": \"2020-07-17 00:00:00\"," + 
			"      \"VTC_DT\": \"2020-07-24 00:00:00\"," + 
			"      \"PPAPGATE_DT\": \"2020-09-18 00:00:00\"," + 
			"      \"VDC_DT\": \"2020-09-04 00:00:00\"," + 
			"      \"SORP_DT\": \"2021-01-18 00:00:00\"," + 
			"      \"PPVBUILD_DT\": \"2020-07-31 00:00:00\"," + 
			"      \"VPI_DT\": null," + 
			"      \"SASPC99_DT\": \"2020-01-20 00:00:00\"," + 
			"      \"APPV_BIW\": \"2020-01-31 00:00:00\"," + 
			"      \"APPV_GA_DT\": \"2020-01-31 00:00:00\"," + 
			"      \"FIVC\": null," + 
			"      \"FPPVA\": \"2020-05-08 00:00:00\"," + 
			"      \"MVB_NS\": \"2020-07-24 00:00:00\"," + 
			"      \"MRD_GA\": \"2020-10-02 00:00:00\"," + 
			"      \"PQQR_DORP\": \"2021-01-11 00:00:00\"," + 
			"      \"VESCOM_65\": \"2019-08-23 00:00:00\"," + 
			"      \"VESCOM_80\": \"2020-01-24 00:00:00\"," + 
			"      \"VESCOM_99\": \"2020-04-03 00:00:00\"," + 
			"      \"VESCOM_100\": \"2020-07-10 00:00:00\"," + 
			"      \"VESCOM_RPR\": \"2020-10-16 00:00:00\"," + 
			"      \"FAPPVA\": \"2020-03-02 00:00:00\"," + 
			"      \"CRT_ID\": \"BATCH\"," + 
			"      \"CRT_TS\": \"2020-10-08 22:40:13\"," + 
			"      \"UPD_ID\": \"BATCH\"," + 
			"      \"UPD_TS\": \"2020-10-08 22:40:13\"" + 
			"    }" + 
			"  ]" + 
			"}";

	public static final String T1ULF = "{" + 
			"  \"count\": 2," + 
			"  \"metadata\": {" + 
			"    \"PROJ_ID\": \"VARCHAR2\"," + 
			"    \"PROJ_NM\": \"VARCHAR2\"," + 
			"    \"PGM_CD\": \"VARCHAR2\"," + 
			"    \"MODEL_YR\": \"VARCHAR2\"," + 
			"    \"PROJ_TYPE\": \"VARCHAR2\"," + 
			"    \"ARCH\": \"VARCHAR2\"," + 
			"    \"GPDS_SUBSYS\": \"VARCHAR2\"," + 
			"    \"LEAD_ARCH_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_DSGN_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_ENG_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_MFG_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_MKTG_REGION\": \"VARCHAR2\"," + 
			"    \"PROJ_STAT\": \"VARCHAR2\"," + 
			"    \"MRD_IEBB_DT\": \"DATE\"," + 
			"    \"SASPC65_DT\": \"DATE\"," + 
			"    \"MRD_IVGA_DT\": \"DATE\"," + 
			"    \"VDBOR65_DT\": \"DATE\"," + 
			"    \"SASPC80_DT\": \"DATE\"," + 
			"    \"MRD_FEBB_DT\": \"DATE\"," + 
			"    \"VDBOR80_DT\": \"DATE\"," + 
			"    \"CALIBCOMP99_DT\": \"DATE\"," + 
			"    \"SASPC100_DT\": \"DATE\"," + 
			"    \"VDBOR100_DT\": \"DATE\"," + 
			"    \"VTC_DT\": \"DATE\"," + 
			"    \"PPAPGATE_DT\": \"DATE\"," + 
			"    \"VDC_DT\": \"DATE\"," + 
			"    \"SORP_DT\": \"DATE\"," + 
			"    \"PPVBUILD_DT\": \"DATE\"," + 
			"    \"VPI_DT\": \"DATE\"," + 
			"    \"SASPC99_DT\": \"DATE\"," + 
			"    \"APPV_BIW\": \"DATE\"," + 
			"    \"APPV_GA_DT\": \"DATE\"," + 
			"    \"FIVC\": \"DATE\"," + 
			"    \"FPPVA\": \"DATE\"," + 
			"    \"MVB_NS\": \"DATE\"," + 
			"    \"MRD_GA\": \"DATE\"," + 
			"    \"PQQR_DORP\": \"DATE\"," + 
			"    \"VESCOM_65\": \"DATE\"," + 
			"    \"VESCOM_80\": \"DATE\"," + 
			"    \"VESCOM_99\": \"DATE\"," + 
			"    \"VESCOM_100\": \"DATE\"," + 
			"    \"VESCOM_RPR\": \"DATE\"," + 
			"    \"FAPPVA\": \"DATE\"," + 
			"    \"CRT_ID\": \"VARCHAR2\"," + 
			"    \"CRT_TS\": \"TIMESTAMP\"," + 
			"    \"UPD_ID\": \"VARCHAR2\"," + 
			"    \"UPD_TS\": \"TIMESTAMP\"" + 
			"  }," + 
			"  \"items\": [" + 
			"    {" + 
			"      \"PROJ_ID\": \"374743737\"," + 
			"      \"PROJ_NM\": \"2021 T1ULF\"," + 
			"      \"PGM_CD\": \"T1ULF\"," + 
			"      \"MODEL_YR\": \"2021\"," + 
			"      \"PROJ_TYPE\": \"S\"," + 
			"      \"ARCH\": \"Truck\"," + 
			"      \"GPDS_SUBSYS\": \"P - Program Plan\"," + 
			"      \"LEAD_ARCH_REGION\": \"GMNA\"," + 
			"      \"LEAD_DSGN_REGION\": \"GMNA\"," + 
			"      \"LEAD_ENG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MFG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MKTG_REGION\": null," + 
			"      \"PROJ_STAT\": \"Approved\"," + 
			"      \"MRD_IEBB_DT\": \"2018-02-27 00:00:00\"," + 
			"      \"SASPC65_DT\": \"2018-07-04 00:00:00\"," + 
			"      \"MRD_IVGA_DT\": \"2018-07-09 00:00:00\"," + 
			"      \"VDBOR65_DT\": \"2018-12-14 00:00:00\"," + 
			"      \"SASPC80_DT\": \"2019-02-01 00:00:00\"," + 
			"      \"MRD_FEBB_DT\": \"2019-04-26 00:00:00\"," + 
			"      \"VDBOR80_DT\": \"2019-05-10 00:00:00\"," + 
			"      \"CALIBCOMP99_DT\": \"2019-06-28 00:00:00\"," + 
			"      \"SASPC100_DT\": \"2019-08-23 00:00:00\"," + 
			"      \"VDBOR100_DT\": \"2019-10-18 00:00:00\"," + 
			"      \"VTC_DT\": \"2019-11-08 00:00:00\"," + 
			"      \"PPAPGATE_DT\": \"2020-02-14 00:00:00\"," + 
			"      \"VDC_DT\": \"2020-01-31 00:00:00\"," + 
			"      \"SORP_DT\": \"2020-07-20 00:00:00\"," + 
			"      \"PPVBUILD_DT\": \"2019-11-08 00:00:00\"," + 
			"      \"VPI_DT\": \"2016-12-19 00:00:00\"," + 
			"      \"SASPC99_DT\": \"2019-04-22 00:00:00\"," + 
			"      \"APPV_BIW\": \"2019-05-24 00:00:00\"," + 
			"      \"APPV_GA_DT\": \"2019-05-24 00:00:00\"," + 
			"      \"FIVC\": \"2018-08-14 00:00:00\"," + 
			"      \"FPPVA\": \"2019-08-16 00:00:00\"," + 
			"      \"MVB_NS\": \"2019-11-01 00:00:00\"," + 
			"      \"MRD_GA\": \"2020-03-06 00:00:00\"," + 
			"      \"PQQR_DORP\": \"2020-07-13 00:00:00\"," + 
			"      \"VESCOM_65\": \"2018-12-07 00:00:00\"," + 
			"      \"VESCOM_80\": \"2019-04-26 00:00:00\"," + 
			"      \"VESCOM_99\": \"2019-07-05 00:00:00\"," + 
			"      \"VESCOM_100\": \"2019-09-13 00:00:00\"," + 
			"      \"VESCOM_RPR\": \"2020-03-06 00:00:00\"," + 
			"      \"FAPPVA\": \"2019-06-24 00:00:00\"," + 
			"      \"CRT_ID\": \"BATCH\"," + 
			"      \"CRT_TS\": \"2020-10-08 22:40:15\"," + 
			"      \"UPD_ID\": \"BATCH\"," + 
			"      \"UPD_TS\": \"2020-10-08 22:40:15\"" + 
			"    }," + 
			"    {" + 
			"      \"PROJ_ID\": \"504285860-1\"," + 
			"      \"PROJ_NM\": \"2021 T1UX NA E/I\"," + 
			"      \"PGM_CD\": \"T1UCF | T1ULF\"," + 
			"      \"MODEL_YR\": \"2021\"," + 
			"      \"PROJ_TYPE\": \"S\"," + 
			"      \"ARCH\": \"Truck\"," + 
			"      \"GPDS_SUBSYS\": \"P - Program Plan\"," + 
			"      \"LEAD_ARCH_REGION\": \"GMNA\"," + 
			"      \"LEAD_DSGN_REGION\": \"GMNA\"," + 
			"      \"LEAD_ENG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MFG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MKTG_REGION\": \"GMNA\"," + 
			"      \"PROJ_STAT\": \"Proposed\"," + 
			"      \"MRD_IEBB_DT\": null," + 
			"      \"SASPC65_DT\": null," + 
			"      \"MRD_IVGA_DT\": null," + 
			"      \"VDBOR65_DT\": \"2019-08-30 00:00:00\"," + 
			"      \"SASPC80_DT\": \"2019-11-01 00:00:00\"," + 
			"      \"MRD_FEBB_DT\": \"2020-01-20 00:00:00\"," + 
			"      \"VDBOR80_DT\": \"2020-02-07 00:00:00\"," + 
			"      \"CALIBCOMP99_DT\": \"2020-03-27 00:00:00\"," + 
			"      \"SASPC100_DT\": \"2020-05-29 00:00:00\"," + 
			"      \"VDBOR100_DT\": \"2020-07-17 00:00:00\"," + 
			"      \"VTC_DT\": \"2020-07-24 00:00:00\"," + 
			"      \"PPAPGATE_DT\": \"2020-09-18 00:00:00\"," + 
			"      \"VDC_DT\": \"2020-09-04 00:00:00\"," + 
			"      \"SORP_DT\": \"2021-01-18 00:00:00\"," + 
			"      \"PPVBUILD_DT\": \"2020-07-31 00:00:00\"," + 
			"      \"VPI_DT\": null," + 
			"      \"SASPC99_DT\": \"2020-01-20 00:00:00\"," + 
			"      \"APPV_BIW\": \"2020-01-31 00:00:00\"," + 
			"      \"APPV_GA_DT\": \"2020-01-31 00:00:00\"," + 
			"      \"FIVC\": null," + 
			"      \"FPPVA\": \"2020-05-08 00:00:00\"," + 
			"      \"MVB_NS\": \"2020-07-24 00:00:00\"," + 
			"      \"MRD_GA\": \"2020-10-02 00:00:00\"," + 
			"      \"PQQR_DORP\": \"2021-01-11 00:00:00\"," + 
			"      \"VESCOM_65\": \"2019-08-23 00:00:00\"," + 
			"      \"VESCOM_80\": \"2020-01-24 00:00:00\"," + 
			"      \"VESCOM_99\": \"2020-04-03 00:00:00\"," + 
			"      \"VESCOM_100\": \"2020-07-10 00:00:00\"," + 
			"      \"VESCOM_RPR\": \"2020-10-16 00:00:00\"," + 
			"      \"FAPPVA\": \"2020-03-02 00:00:00\"," + 
			"      \"CRT_ID\": \"BATCH\"," + 
			"      \"CRT_TS\": \"2020-10-08 22:40:13\"," + 
			"      \"UPD_ID\": \"BATCH\"," + 
			"      \"UPD_TS\": \"2020-10-08 22:40:13\"" + 
			"    }" + 
			"  ]" + 
			"}";

	public static final String T1UXF = "{" + 
			"  \"count\": 1," + 
			"  \"metadata\": {" + 
			"    \"PROJ_ID\": \"VARCHAR2\"," + 
			"    \"PROJ_NM\": \"VARCHAR2\"," + 
			"    \"PGM_CD\": \"VARCHAR2\"," + 
			"    \"MODEL_YR\": \"VARCHAR2\"," + 
			"    \"PROJ_TYPE\": \"VARCHAR2\"," + 
			"    \"ARCH\": \"VARCHAR2\"," + 
			"    \"GPDS_SUBSYS\": \"VARCHAR2\"," + 
			"    \"LEAD_ARCH_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_DSGN_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_ENG_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_MFG_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_MKTG_REGION\": \"VARCHAR2\"," + 
			"    \"PROJ_STAT\": \"VARCHAR2\"," + 
			"    \"MRD_IEBB_DT\": \"DATE\"," + 
			"    \"SASPC65_DT\": \"DATE\"," + 
			"    \"MRD_IVGA_DT\": \"DATE\"," + 
			"    \"VDBOR65_DT\": \"DATE\"," + 
			"    \"SASPC80_DT\": \"DATE\"," + 
			"    \"MRD_FEBB_DT\": \"DATE\"," + 
			"    \"VDBOR80_DT\": \"DATE\"," + 
			"    \"CALIBCOMP99_DT\": \"DATE\"," + 
			"    \"SASPC100_DT\": \"DATE\"," + 
			"    \"VDBOR100_DT\": \"DATE\"," + 
			"    \"VTC_DT\": \"DATE\"," + 
			"    \"PPAPGATE_DT\": \"DATE\"," + 
			"    \"VDC_DT\": \"DATE\"," + 
			"    \"SORP_DT\": \"DATE\"," + 
			"    \"PPVBUILD_DT\": \"DATE\"," + 
			"    \"VPI_DT\": \"DATE\"," + 
			"    \"SASPC99_DT\": \"DATE\"," + 
			"    \"APPV_BIW\": \"DATE\"," + 
			"    \"APPV_GA_DT\": \"DATE\"," + 
			"    \"FIVC\": \"DATE\"," + 
			"    \"FPPVA\": \"DATE\"," + 
			"    \"MVB_NS\": \"DATE\"," + 
			"    \"MRD_GA\": \"DATE\"," + 
			"    \"PQQR_DORP\": \"DATE\"," + 
			"    \"VESCOM_65\": \"DATE\"," + 
			"    \"VESCOM_80\": \"DATE\"," + 
			"    \"VESCOM_99\": \"DATE\"," + 
			"    \"VESCOM_100\": \"DATE\"," + 
			"    \"VESCOM_RPR\": \"DATE\"," + 
			"    \"FAPPVA\": \"DATE\"," + 
			"    \"CRT_ID\": \"VARCHAR2\"," + 
			"    \"CRT_TS\": \"TIMESTAMP\"," + 
			"    \"UPD_ID\": \"VARCHAR2\"," + 
			"    \"UPD_TS\": \"TIMESTAMP\"" + 
			"  }," + 
			"  \"items\": [" + 
			"    {" + 
			"      \"PROJ_ID\": \"402215568\"," + 
			"      \"PROJ_NM\": \"2021 T1UXF/T1YXF NA E LM2\"," + 
			"      \"PGM_CD\": \"T1UXF/T1YXF\"," + 
			"      \"MODEL_YR\": \"2021\"," + 
			"      \"PROJ_TYPE\": \"S\"," + 
			"      \"ARCH\": \"Truck\"," + 
			"      \"GPDS_SUBSYS\": \"P - Program Plan\"," + 
			"      \"LEAD_ARCH_REGION\": \"GMNA\"," + 
			"      \"LEAD_DSGN_REGION\": \"GMNA\"," + 
			"      \"LEAD_ENG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MFG_REGION\": null," + 
			"      \"LEAD_MKTG_REGION\": \"GME\"," + 
			"      \"PROJ_STAT\": \"Approved\"," + 
			"      \"MRD_IEBB_DT\": null," + 
			"      \"SASPC65_DT\": null," + 
			"      \"MRD_IVGA_DT\": \"2018-09-17 00:00:00\"," + 
			"      \"VDBOR65_DT\": \"2019-05-10 00:00:00\"," + 
			"      \"SASPC80_DT\": \"2019-06-21 00:00:00\"," + 
			"      \"MRD_FEBB_DT\": \"2019-10-07 00:00:00\"," + 
			"      \"VDBOR80_DT\": \"2019-10-11 00:00:00\"," + 
			"      \"CALIBCOMP99_DT\": \"2019-11-29 00:00:00\"," + 
			"      \"SASPC100_DT\": \"2020-01-24 00:00:00\"," + 
			"      \"VDBOR100_DT\": \"2020-03-20 00:00:00\"," + 
			"      \"VTC_DT\": \"2020-04-10 00:00:00\"," + 
			"      \"PPAPGATE_DT\": \"2020-06-05 00:00:00\"," + 
			"      \"VDC_DT\": \"2020-05-22 00:00:00\"," + 
			"      \"SORP_DT\": \"2020-09-28 00:00:00\"," + 
			"      \"PPVBUILD_DT\": \"2020-04-17 00:00:00\"," + 
			"      \"VPI_DT\": \"2016-12-19 00:00:00\"," + 
			"      \"SASPC99_DT\": \"2019-09-23 00:00:00\"," + 
			"      \"APPV_BIW\": \"2019-10-04 00:00:00\"," + 
			"      \"APPV_GA_DT\": \"2019-10-04 00:00:00\"," + 
			"      \"FIVC\": \"2018-10-19 00:00:00\"," + 
			"      \"FPPVA\": \"2020-01-24 00:00:00\"," + 
			"      \"MVB_NS\": \"2020-04-10 00:00:00\"," + 
			"      \"MRD_GA\": \"2020-06-19 00:00:00\"," + 
			"      \"PQQR_DORP\": \"2020-09-28 00:00:00\"," + 
			"      \"VESCOM_65\": \"2019-05-03 00:00:00\"," + 
			"      \"VESCOM_80\": \"2019-09-27 00:00:00\"," + 
			"      \"VESCOM_99\": \"2019-12-06 00:00:00\"," + 
			"      \"VESCOM_100\": \"2020-02-14 00:00:00\"," + 
			"      \"VESCOM_RPR\": \"2020-07-03 00:00:00\"," + 
			"      \"FAPPVA\": \"2019-11-04 00:00:00\"," + 
			"      \"CRT_ID\": \"BATCH\"," + 
			"      \"CRT_TS\": \"2020-10-08 22:40:22\"," + 
			"      \"UPD_ID\": \"BATCH\"," + 
			"      \"UPD_TS\": \"2020-10-08 22:40:22\"" + 
			"    }" + 
			"  ]" + 
			"}";

	public static final String T1XLF = "{" + 
			"  \"count\": 1," + 
			"  \"metadata\": {" + 
			"    \"PROJ_ID\": \"VARCHAR2\"," + 
			"    \"PROJ_NM\": \"VARCHAR2\"," + 
			"    \"PGM_CD\": \"VARCHAR2\"," + 
			"    \"MODEL_YR\": \"VARCHAR2\"," + 
			"    \"PROJ_TYPE\": \"VARCHAR2\"," + 
			"    \"ARCH\": \"VARCHAR2\"," + 
			"    \"GPDS_SUBSYS\": \"VARCHAR2\"," + 
			"    \"LEAD_ARCH_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_DSGN_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_ENG_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_MFG_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_MKTG_REGION\": \"VARCHAR2\"," + 
			"    \"PROJ_STAT\": \"VARCHAR2\"," + 
			"    \"MRD_IEBB_DT\": \"DATE\"," + 
			"    \"SASPC65_DT\": \"DATE\"," + 
			"    \"MRD_IVGA_DT\": \"DATE\"," + 
			"    \"VDBOR65_DT\": \"DATE\"," + 
			"    \"SASPC80_DT\": \"DATE\"," + 
			"    \"MRD_FEBB_DT\": \"DATE\"," + 
			"    \"VDBOR80_DT\": \"DATE\"," + 
			"    \"CALIBCOMP99_DT\": \"DATE\"," + 
			"    \"SASPC100_DT\": \"DATE\"," + 
			"    \"VDBOR100_DT\": \"DATE\"," + 
			"    \"VTC_DT\": \"DATE\"," + 
			"    \"PPAPGATE_DT\": \"DATE\"," + 
			"    \"VDC_DT\": \"DATE\"," + 
			"    \"SORP_DT\": \"DATE\"," + 
			"    \"PPVBUILD_DT\": \"DATE\"," + 
			"    \"VPI_DT\": \"DATE\"," + 
			"    \"SASPC99_DT\": \"DATE\"," + 
			"    \"APPV_BIW\": \"DATE\"," + 
			"    \"APPV_GA_DT\": \"DATE\"," + 
			"    \"FIVC\": \"DATE\"," + 
			"    \"FPPVA\": \"DATE\"," + 
			"    \"MVB_NS\": \"DATE\"," + 
			"    \"MRD_GA\": \"DATE\"," + 
			"    \"PQQR_DORP\": \"DATE\"," + 
			"    \"VESCOM_65\": \"DATE\"," + 
			"    \"VESCOM_80\": \"DATE\"," + 
			"    \"VESCOM_99\": \"DATE\"," + 
			"    \"VESCOM_100\": \"DATE\"," + 
			"    \"VESCOM_RPR\": \"DATE\"," + 
			"    \"FAPPVA\": \"DATE\"," + 
			"    \"CRT_ID\": \"VARCHAR2\"," + 
			"    \"CRT_TS\": \"TIMESTAMP\"," + 
			"    \"UPD_ID\": \"VARCHAR2\"," + 
			"    \"UPD_TS\": \"TIMESTAMP\"" + 
			"  }," + 
			"  \"items\": [" + 
			"    {" + 
			"      \"PROJ_ID\": \"444674651\"," + 
			"      \"PROJ_NM\": \"2021 T1xLF UKL\"," + 
			"      \"PGM_CD\": \"T1xLF\"," + 
			"      \"MODEL_YR\": \"2021\"," + 
			"      \"PROJ_TYPE\": \"MCP\"," + 
			"      \"ARCH\": \"Truck\"," + 
			"      \"GPDS_SUBSYS\": \"P - Program Plan\"," + 
			"      \"LEAD_ARCH_REGION\": \"GMNA\"," + 
			"      \"LEAD_DSGN_REGION\": \"GMNA\"," + 
			"      \"LEAD_ENG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MFG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MKTG_REGION\": \"GMNA\"," + 
			"      \"PROJ_STAT\": \"Approved\"," + 
			"      \"MRD_IEBB_DT\": \"2018-09-03 00:00:00\"," + 
			"      \"SASPC65_DT\": \"2019-01-01 00:00:00\"," + 
			"      \"MRD_IVGA_DT\": \"2019-01-07 00:00:00\"," + 
			"      \"VDBOR65_DT\": \"2019-05-31 00:00:00\"," + 
			"      \"SASPC80_DT\": \"2019-08-02 00:00:00\"," + 
			"      \"MRD_FEBB_DT\": \"2019-10-14 00:00:00\"," + 
			"      \"VDBOR80_DT\": \"2019-11-08 00:00:00\"," + 
			"      \"CALIBCOMP99_DT\": \"2019-12-27 00:00:00\"," + 
			"      \"SASPC100_DT\": \"2020-02-28 00:00:00\"," + 
			"      \"VDBOR100_DT\": \"2020-04-17 00:00:00\"," + 
			"      \"VTC_DT\": \"2020-04-24 00:00:00\"," + 
			"      \"PPAPGATE_DT\": \"2020-06-26 00:00:00\"," + 
			"      \"VDC_DT\": \"2020-06-05 00:00:00\"," + 
			"      \"SORP_DT\": \"2020-10-19 00:00:00\"," + 
			"      \"PPVBUILD_DT\": \"2020-04-24 00:00:00\"," + 
			"      \"VPI_DT\": \"2017-09-25 00:00:00\"," + 
			"      \"SASPC99_DT\": \"2019-10-21 00:00:00\"," + 
			"      \"APPV_BIW\": \"2019-10-25 00:00:00\"," + 
			"      \"APPV_GA_DT\": \"2019-10-25 00:00:00\"," + 
			"      \"FIVC\": \"2019-02-04 00:00:00\"," + 
			"      \"FPPVA\": \"2020-01-31 00:00:00\"," + 
			"      \"MVB_NS\": \"2020-04-24 00:00:00\"," + 
			"      \"MRD_GA\": \"2020-07-10 00:00:00\"," + 
			"      \"PQQR_DORP\": \"2020-10-19 00:00:00\"," + 
			"      \"VESCOM_65\": \"2019-05-24 00:00:00\"," + 
			"      \"VESCOM_80\": \"2019-10-25 00:00:00\"," + 
			"      \"VESCOM_99\": \"2020-01-03 00:00:00\"," + 
			"      \"VESCOM_100\": \"2020-04-10 00:00:00\"," + 
			"      \"VESCOM_RPR\": \"2020-07-17 00:00:00\"," + 
			"      \"FAPPVA\": \"2019-11-25 00:00:00\"," + 
			"      \"CRT_ID\": \"BATCH\"," + 
			"      \"CRT_TS\": \"2020-10-08 22:42:19\"," + 
			"      \"UPD_ID\": \"BATCH\"," + 
			"      \"UPD_TS\": \"2020-10-08 22:42:19\"" + 
			"    }" + 
			"  ]" + 
			"}";

	public static final String T1YCF = "{" + 
			"  \"count\": 1," + 
			"  \"metadata\": {" + 
			"    \"PROJ_ID\": \"VARCHAR2\"," + 
			"    \"PROJ_NM\": \"VARCHAR2\"," + 
			"    \"PGM_CD\": \"VARCHAR2\"," + 
			"    \"MODEL_YR\": \"VARCHAR2\"," + 
			"    \"PROJ_TYPE\": \"VARCHAR2\"," + 
			"    \"ARCH\": \"VARCHAR2\"," + 
			"    \"GPDS_SUBSYS\": \"VARCHAR2\"," + 
			"    \"LEAD_ARCH_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_DSGN_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_ENG_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_MFG_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_MKTG_REGION\": \"VARCHAR2\"," + 
			"    \"PROJ_STAT\": \"VARCHAR2\"," + 
			"    \"MRD_IEBB_DT\": \"DATE\"," + 
			"    \"SASPC65_DT\": \"DATE\"," + 
			"    \"MRD_IVGA_DT\": \"DATE\"," + 
			"    \"VDBOR65_DT\": \"DATE\"," + 
			"    \"SASPC80_DT\": \"DATE\"," + 
			"    \"MRD_FEBB_DT\": \"DATE\"," + 
			"    \"VDBOR80_DT\": \"DATE\"," + 
			"    \"CALIBCOMP99_DT\": \"DATE\"," + 
			"    \"SASPC100_DT\": \"DATE\"," + 
			"    \"VDBOR100_DT\": \"DATE\"," + 
			"    \"VTC_DT\": \"DATE\"," + 
			"    \"PPAPGATE_DT\": \"DATE\"," + 
			"    \"VDC_DT\": \"DATE\"," + 
			"    \"SORP_DT\": \"DATE\"," + 
			"    \"PPVBUILD_DT\": \"DATE\"," + 
			"    \"VPI_DT\": \"DATE\"," + 
			"    \"SASPC99_DT\": \"DATE\"," + 
			"    \"APPV_BIW\": \"DATE\"," + 
			"    \"APPV_GA_DT\": \"DATE\"," + 
			"    \"FIVC\": \"DATE\"," + 
			"    \"FPPVA\": \"DATE\"," + 
			"    \"MVB_NS\": \"DATE\"," + 
			"    \"MRD_GA\": \"DATE\"," + 
			"    \"PQQR_DORP\": \"DATE\"," + 
			"    \"VESCOM_65\": \"DATE\"," + 
			"    \"VESCOM_80\": \"DATE\"," + 
			"    \"VESCOM_99\": \"DATE\"," + 
			"    \"VESCOM_100\": \"DATE\"," + 
			"    \"VESCOM_RPR\": \"DATE\"," + 
			"    \"FAPPVA\": \"DATE\"," + 
			"    \"CRT_ID\": \"VARCHAR2\"," + 
			"    \"CRT_TS\": \"TIMESTAMP\"," + 
			"    \"UPD_ID\": \"VARCHAR2\"," + 
			"    \"UPD_TS\": \"TIMESTAMP\"" + 
			"  }," + 
			"  \"items\": [" + 
			"    {" + 
			"      \"PROJ_ID\": \"390727431\"," + 
			"      \"PROJ_NM\": \"2021 T1YCF/T1YGF\"," + 
			"      \"PGM_CD\": \"T1YCF/T1YGF\"," + 
			"      \"MODEL_YR\": \"2021\"," + 
			"      \"PROJ_TYPE\": \"S\"," + 
			"      \"ARCH\": \"Truck\"," + 
			"      \"GPDS_SUBSYS\": \"P - Program Plan\"," + 
			"      \"LEAD_ARCH_REGION\": \"GMNA\"," + 
			"      \"LEAD_DSGN_REGION\": \"GMNA\"," + 
			"      \"LEAD_ENG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MFG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MKTG_REGION\": null," + 
			"      \"PROJ_STAT\": \"Approved\"," + 
			"      \"MRD_IEBB_DT\": null," + 
			"      \"SASPC65_DT\": null," + 
			"      \"MRD_IVGA_DT\": \"2018-05-04 00:00:00\"," + 
			"      \"VDBOR65_DT\": null," + 
			"      \"SASPC80_DT\": null," + 
			"      \"MRD_FEBB_DT\": \"2019-03-15 00:00:00\"," + 
			"      \"VDBOR80_DT\": null," + 
			"      \"CALIBCOMP99_DT\": \"2019-04-19 00:00:00\"," + 
			"      \"SASPC100_DT\": null," + 
			"      \"VDBOR100_DT\": null," + 
			"      \"VTC_DT\": \"2019-08-23 00:00:00\"," + 
			"      \"PPAPGATE_DT\": \"2019-11-01 00:00:00\"," + 
			"      \"VDC_DT\": \"2019-10-18 00:00:00\"," + 
			"      \"SORP_DT\": \"2020-05-25 00:00:00\"," + 
			"      \"PPVBUILD_DT\": \"2019-09-13 00:00:00\"," + 
			"      \"VPI_DT\": \"2016-12-19 00:00:00\"," + 
			"      \"SASPC99_DT\": null," + 
			"      \"APPV_BIW\": \"2019-03-29 00:00:00\"," + 
			"      \"APPV_GA_DT\": \"2019-02-15 00:00:00\"," + 
			"      \"FIVC\": \"2018-06-08 00:00:00\"," + 
			"      \"FPPVA\": \"2019-07-05 00:00:00\"," + 
			"      \"MVB_NS\": \"2019-09-06 00:00:00\"," + 
			"      \"MRD_GA\": \"2019-11-15 00:00:00\"," + 
			"      \"PQQR_DORP\": \"2020-05-18 00:00:00\"," + 
			"      \"VESCOM_65\": null," + 
			"      \"VESCOM_80\": null," + 
			"      \"VESCOM_99\": null," + 
			"      \"VESCOM_100\": null," + 
			"      \"VESCOM_RPR\": \"2019-11-29 00:00:00\"," + 
			"      \"FAPPVA\": \"2019-04-29 00:00:00\"," + 
			"      \"CRT_ID\": \"BATCH\"," + 
			"      \"CRT_TS\": \"2020-10-08 22:40:31\"," + 
			"      \"UPD_ID\": \"BATCH\"," + 
			"      \"UPD_TS\": \"2020-10-08 22:40:31\"" + 
			"    }" + 
			"  ]" + 
			"}";

	public static final String T1YLF = "{" + 
			"  \"count\": 1," + 
			"  \"metadata\": {" + 
			"    \"PROJ_ID\": \"VARCHAR2\"," + 
			"    \"PROJ_NM\": \"VARCHAR2\"," + 
			"    \"PGM_CD\": \"VARCHAR2\"," + 
			"    \"MODEL_YR\": \"VARCHAR2\"," + 
			"    \"PROJ_TYPE\": \"VARCHAR2\"," + 
			"    \"ARCH\": \"VARCHAR2\"," + 
			"    \"GPDS_SUBSYS\": \"VARCHAR2\"," + 
			"    \"LEAD_ARCH_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_DSGN_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_ENG_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_MFG_REGION\": \"VARCHAR2\"," + 
			"    \"LEAD_MKTG_REGION\": \"VARCHAR2\"," + 
			"    \"PROJ_STAT\": \"VARCHAR2\"," + 
			"    \"MRD_IEBB_DT\": \"DATE\"," + 
			"    \"SASPC65_DT\": \"DATE\"," + 
			"    \"MRD_IVGA_DT\": \"DATE\"," + 
			"    \"VDBOR65_DT\": \"DATE\"," + 
			"    \"SASPC80_DT\": \"DATE\"," + 
			"    \"MRD_FEBB_DT\": \"DATE\"," + 
			"    \"VDBOR80_DT\": \"DATE\"," + 
			"    \"CALIBCOMP99_DT\": \"DATE\"," + 
			"    \"SASPC100_DT\": \"DATE\"," + 
			"    \"VDBOR100_DT\": \"DATE\"," + 
			"    \"VTC_DT\": \"DATE\"," + 
			"    \"PPAPGATE_DT\": \"DATE\"," + 
			"    \"VDC_DT\": \"DATE\"," + 
			"    \"SORP_DT\": \"DATE\"," + 
			"    \"PPVBUILD_DT\": \"DATE\"," + 
			"    \"VPI_DT\": \"DATE\"," + 
			"    \"SASPC99_DT\": \"DATE\"," + 
			"    \"APPV_BIW\": \"DATE\"," + 
			"    \"APPV_GA_DT\": \"DATE\"," + 
			"    \"FIVC\": \"DATE\"," + 
			"    \"FPPVA\": \"DATE\"," + 
			"    \"MVB_NS\": \"DATE\"," + 
			"    \"MRD_GA\": \"DATE\"," + 
			"    \"PQQR_DORP\": \"DATE\"," + 
			"    \"VESCOM_65\": \"DATE\"," + 
			"    \"VESCOM_80\": \"DATE\"," + 
			"    \"VESCOM_99\": \"DATE\"," + 
			"    \"VESCOM_100\": \"DATE\"," + 
			"    \"VESCOM_RPR\": \"DATE\"," + 
			"    \"FAPPVA\": \"DATE\"," + 
			"    \"CRT_ID\": \"VARCHAR2\"," + 
			"    \"CRT_TS\": \"TIMESTAMP\"," + 
			"    \"UPD_ID\": \"VARCHAR2\"," + 
			"    \"UPD_TS\": \"TIMESTAMP\"" + 
			"  }," + 
			"  \"items\": [" + 
			"    {" + 
			"      \"PROJ_ID\": \"421694604\"," + 
			"      \"PROJ_NM\": \"2021 T1YLF\"," + 
			"      \"PGM_CD\": \"T1YLF\"," + 
			"      \"MODEL_YR\": \"2021\"," + 
			"      \"PROJ_TYPE\": \"S\"," + 
			"      \"ARCH\": \"Truck\"," + 
			"      \"GPDS_SUBSYS\": \"P - Program Plan\"," + 
			"      \"LEAD_ARCH_REGION\": \"GMNA\"," + 
			"      \"LEAD_DSGN_REGION\": \"GMNA\"," + 
			"      \"LEAD_ENG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MFG_REGION\": \"GMNA\"," + 
			"      \"LEAD_MKTG_REGION\": null," + 
			"      \"PROJ_STAT\": \"Approved\"," + 
			"      \"MRD_IEBB_DT\": \"2018-03-23 00:00:00\"," + 
			"      \"SASPC65_DT\": \"2018-07-30 00:00:00\"," + 
			"      \"MRD_IVGA_DT\": \"2018-08-03 00:00:00\"," + 
			"      \"VDBOR65_DT\": \"2018-12-14 00:00:00\"," + 
			"      \"SASPC80_DT\": \"2019-02-01 00:00:00\"," + 
			"      \"MRD_FEBB_DT\": \"2019-05-24 00:00:00\"," + 
			"      \"VDBOR80_DT\": \"2019-05-10 00:00:00\"," + 
			"      \"CALIBCOMP99_DT\": \"2019-06-28 00:00:00\"," + 
			"      \"SASPC100_DT\": \"2019-08-23 00:00:00\"," + 
			"      \"VDBOR100_DT\": \"2019-10-18 00:00:00\"," + 
			"      \"VTC_DT\": \"2019-12-06 00:00:00\"," + 
			"      \"PPAPGATE_DT\": \"2020-02-28 00:00:00\"," + 
			"      \"VDC_DT\": \"2020-02-14 00:00:00\"," + 
			"      \"SORP_DT\": \"2020-07-20 00:00:00\"," + 
			"      \"PPVBUILD_DT\": \"2019-12-06 00:00:00\"," + 
			"      \"VPI_DT\": \"2016-12-19 00:00:00\"," + 
			"      \"SASPC99_DT\": \"2019-04-22 00:00:00\"," + 
			"      \"APPV_BIW\": \"2019-07-05 00:00:00\"," + 
			"      \"APPV_GA_DT\": \"2019-06-28 00:00:00\"," + 
			"      \"FIVC\": \"2018-09-07 00:00:00\"," + 
			"      \"FPPVA\": \"2019-09-13 00:00:00\"," + 
			"      \"MVB_NS\": \"2019-11-22 00:00:00\"," + 
			"      \"MRD_GA\": \"2020-03-13 00:00:00\"," + 
			"      \"PQQR_DORP\": \"2020-07-13 00:00:00\"," + 
			"      \"VESCOM_65\": \"2018-12-07 00:00:00\"," + 
			"      \"VESCOM_80\": \"2019-04-26 00:00:00\"," + 
			"      \"VESCOM_99\": \"2019-07-05 00:00:00\"," + 
			"      \"VESCOM_100\": \"2019-09-13 00:00:00\"," + 
			"      \"VESCOM_RPR\": \"2020-03-06 00:00:00\"," + 
			"      \"FAPPVA\": \"2019-08-05 00:00:00\"," + 
			"      \"CRT_ID\": \"BATCH\"," + 
			"      \"CRT_TS\": \"2020-10-08 22:40:14\"," + 
			"      \"UPD_ID\": \"BATCH\"," + 
			"      \"UPD_TS\": \"2020-10-08 22:40:14\"" + 
			"    }" + 
			"  ]" + 
			"}";


	public static Map<String, Project> getProjectData(){
		Map<String, Project> map = new HashMap<String, Project>();
		try{

			JSONObject T1UCF_J = new JSONObject(T1UCF);
			JSONObject T1ULF_J = new JSONObject(T1ULF);
			JSONObject T1UXF_J = new JSONObject(T1UXF);
			JSONObject T1XLF_J = new JSONObject(T1XLF);
			JSONObject T1YCF_J = new JSONObject(T1YCF);
			JSONObject T1YLF_J = new JSONObject(T1YLF);

			parseJsonToObject(map, T1UCF_J);
			parseJsonToObject(map, T1ULF_J);
			parseJsonToObject(map, T1UXF_J);
			parseJsonToObject(map, T1XLF_J);
			parseJsonToObject(map, T1YCF_J);
			parseJsonToObject(map, T1YLF_J);
		}catch(Exception exception) {
			//eat
		}
		return map;
	}

	private static void parseJsonToObject(Map<String, Project> map, JSONObject T1UCF_J)
			throws JsonProcessingException, JsonMappingException {
		JSONArray jsonArray = T1UCF_J.getJSONArray("items");  
		for (int index = 0; index < jsonArray.length(); index++){   
			Project productReadValue = new ObjectMapper().readValue(jsonArray.get(index).toString(), Project.class);
			map.put(productReadValue.getPROJ_ID(),  productReadValue);
			System.out.println(productReadValue);
		}
	}

	// for local test
	//	public static void main(String[] strings) {
	//		Map<String, Project> projectData = StaticDataUtil.getProjectData();
	//		System.out.println(projectData);
	//	}

}
