package siteforge;

import java.util.List;

public class ExportObjectOps {
	public static void main(String[] args) {
		DeployDashboardWrapper wrapper = new DeployDashboardWrapper();
		wrapper.setProgramId(598);
		wrapper.setActualDate("2023-01-01 00:00:00||2023-12-31 23:59:5");
		wrapper.setPlannedDate("2023-01-01 00:00:00||2023-12-31 23:59:59");
		
		String strPayload = wrapper.toString();
		System.out.println("strPayload:::::"+strPayload);
		
//		String[] strArr = strPayload.split(",");
//		
//		DeployDashboardWrapper newWrapper = new DeployDashboardWrapper();
//		
//		for(String str:strArr) {
//			
//			String[] strArray = str.split("=");
//			if(strArray[0].trim().equalsIgnoreCase("programId")) {
//				newWrapper.setProgramId(Integer.parseInt(strArray[1]));
//			} else if (strArray[0].trim().equalsIgnoreCase("plannedDate")) {
//				newWrapper.setPlannedDate(strArray[1]);
//			} else if (strArray[0].trim().equalsIgnoreCase("actualDate")) {
//				newWrapper.setActualDate(strArray[1]);
//			}
//		}
//		System.out.println("newWrapper::::::"+newWrapper.getProgramId());
//		System.out.println("newWrapper::::::"+newWrapper.getPlannedDate());
//		System.out.println("newWrapper::::::"+newWrapper.getActualDate());
	}
}
