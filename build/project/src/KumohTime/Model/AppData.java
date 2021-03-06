package KumohTime.Model;

import java.util.LinkedList;
import java.util.List;

import KumohTime.Model.Properties.AppPropertise;
import KumohTime.Model.Properties.ResourcePropertise;
import KumohTime.Model.TimeTable.SaveData.SaveDataController;

public class AppData {

	final public static String propertisePath = "config/";
	final public static String dataPath = "data/";
	final public static String databasePath= "kumohtime.db";
	final public static String saveFilePath= dataPath + "savefile.dat";
	final public static String clientPath = "KumohTime.jar";
	
	public static int runningThread = 0;
	public static int totalThread = 0;
	
	private float appVersion;
	private float serverVersion;
	private String serverPath;
	
	private TimeTableData timeTableData;
	
	private AppPropertise appPropertise;
	private SaveDataController saveDataController;
	private ResourcePropertise resourcesPropertise;
	
	public AppData(AppData appData) {
		
		appPropertise = new AppPropertise();
		this.appVersion = getAppPropertise().getVersion();
		this.serverVersion = appData.getServerVersion();
		this.serverPath = appData.getServerPath();
		
		timeTableData = new TimeTableData();
		saveDataController = new SaveDataController();
		resourcesPropertise = new ResourcePropertise();
	}

	public AppData(float serverVersion, String serverPath) {
		this.serverVersion = serverVersion;
		this.serverPath = serverPath;
	}

	public String getServerPath() {
		return serverPath;
	}

	public float getServerVersion() {
		return serverVersion;
	}
	
	public AppPropertise getAppPropertise() {
		return appPropertise;
	}
	
	public TimeTableData getTimeTableData() {
		return timeTableData;
	}

	public SaveDataController getSaveDataController() {
		return saveDataController;
	}
	
	public ResourcePropertise getResourcePropertise() {
		return resourcesPropertise;
	}
	
	

}
