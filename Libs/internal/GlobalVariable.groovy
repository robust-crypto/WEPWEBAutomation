package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object DeBeersUsers
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object MaintenanceDBRSAuto
     
    /**
     * <p></p>
     */
    public static Object EquipmentFailureDBRSAuto
     
    /**
     * <p></p>
     */
    public static Object ActivityReportDBRSAuto
     
    /**
     * <p></p>
     */
    public static Object WorkRequestTypes
     
    /**
     * <p></p>
     */
    public static Object DBRSFollowOnWorkRequestTypes
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object DeBeersPreprod
     
    /**
     * <p></p>
     */
    public static Object PreprodENV
     
    /**
     * <p></p>
     */
    public static Object PlatsUsers
     
    /**
     * <p></p>
     */
    public static Object PortUsers
     
    /**
     * <p></p>
     */
    public static Object WRtypes
     
    /**
     * <p></p>
     */
    public static Object followOnWRtypes
     
    /**
     * <p></p>
     */
    public static Object PortWRtypes
     
    /**
     * <p></p>
     */
    public static Object PortFollowOnWRTypes
     
    /**
     * <p></p>
     */
    public static Object SearchErpVerifyWCAM
     
    /**
     * <p></p>
     */
    public static Object FlocSearhcERPAM
     
    /**
     * <p></p>
     */
    public static Object SearchERPflocAM
     
    /**
     * <p></p>
     */
    public static Object SearchERPwcCodeDescriprionAM
     
    /**
     * <p></p>
     */
    public static Object SearchERPWONumberAM
     
    /**
     * <p></p>
     */
    public static Object BU
     
    /**
     * <p></p>
     */
    public static Object TestENV
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            DeBeersUsers = selectedVariables['DeBeersUsers']
            Password = selectedVariables['Password']
            MaintenanceDBRSAuto = selectedVariables['MaintenanceDBRSAuto']
            EquipmentFailureDBRSAuto = selectedVariables['EquipmentFailureDBRSAuto']
            ActivityReportDBRSAuto = selectedVariables['ActivityReportDBRSAuto']
            WorkRequestTypes = selectedVariables['WorkRequestTypes']
            DBRSFollowOnWorkRequestTypes = selectedVariables['DBRSFollowOnWorkRequestTypes']
            url = selectedVariables['url']
            DeBeersPreprod = selectedVariables['DeBeersPreprod']
            PreprodENV = selectedVariables['PreprodENV']
            PlatsUsers = selectedVariables['PlatsUsers']
            PortUsers = selectedVariables['PortUsers']
            WRtypes = selectedVariables['WRtypes']
            followOnWRtypes = selectedVariables['followOnWRtypes']
            PortWRtypes = selectedVariables['PortWRtypes']
            PortFollowOnWRTypes = selectedVariables['PortFollowOnWRTypes']
            SearchErpVerifyWCAM = selectedVariables['SearchErpVerifyWCAM']
            FlocSearhcERPAM = selectedVariables['FlocSearhcERPAM']
            SearchERPflocAM = selectedVariables['SearchERPflocAM']
            SearchERPwcCodeDescriprionAM = selectedVariables['SearchERPwcCodeDescriprionAM']
            SearchERPWONumberAM = selectedVariables['SearchERPWONumberAM']
            BU = selectedVariables['BU']
            TestENV = selectedVariables['TestENV']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
