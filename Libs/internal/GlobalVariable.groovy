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
    public static Object PlatsUsers
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object MaintenanceRequest
     
    /**
     * <p></p>
     */
    public static Object IOBUser2
     
    /**
     * <p></p>
     */
    public static Object Malfunction
     
    /**
     * <p></p>
     */
    public static Object OperationRequest
     
    /**
     * <p></p>
     */
    public static Object ProductionRequest
     
    /**
     * <p></p>
     */
    public static Object WRtypes
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object followOnWRtypes
     
    /**
     * <p></p>
     */
    public static Object DeBeersUsers
     
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
    public static Object DeBeersPreprod
     
    /**
     * <p></p>
     */
    public static Object PreprodENV
     
    /**
     * <p></p>
     */
    public static Object PortUsers
     
    /**
     * <p></p>
     */
    public static Object TestENV
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            PlatsUsers = selectedVariables['PlatsUsers']
            Password = selectedVariables['Password']
            MaintenanceRequest = selectedVariables['MaintenanceRequest']
            IOBUser2 = selectedVariables['IOBUser2']
            Malfunction = selectedVariables['Malfunction']
            OperationRequest = selectedVariables['OperationRequest']
            ProductionRequest = selectedVariables['ProductionRequest']
            WRtypes = selectedVariables['WRtypes']
            url = selectedVariables['url']
            followOnWRtypes = selectedVariables['followOnWRtypes']
            DeBeersUsers = selectedVariables['DeBeersUsers']
            MaintenanceDBRSAuto = selectedVariables['MaintenanceDBRSAuto']
            EquipmentFailureDBRSAuto = selectedVariables['EquipmentFailureDBRSAuto']
            ActivityReportDBRSAuto = selectedVariables['ActivityReportDBRSAuto']
            WorkRequestTypes = selectedVariables['WorkRequestTypes']
            DBRSFollowOnWorkRequestTypes = selectedVariables['DBRSFollowOnWorkRequestTypes']
            DeBeersPreprod = selectedVariables['DeBeersPreprod']
            PreprodENV = selectedVariables['PreprodENV']
            PortUsers = selectedVariables['PortUsers']
            TestENV = selectedVariables['TestENV']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
