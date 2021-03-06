/**
 * © Copyright IBM Corporation 2016.
 * © Copyright HCL Technologies Ltd. 2017,2018. 
 * LICENSE: Apache License, Version 2.0 https://www.apache.org/licenses/LICENSE-2.0
 */

package com.hcl.appscan.sdk;

public interface CoreConstants {

	String APP_ID						= "AppId";												//$NON-NLS-1$
	String EMAIL_NOTIFICATION			= "EnableMailNotification";								//$NON-NLS-1$
	String FILE_ID 						= "FileId"; 											//$NON-NLS-1$
	String FILE_TO_UPLOAD 				= "fileToUpload";										//$NON-NLS-1$
	String ID							= "Id";													//$NON-NLS-1$
	String KEY							= "Key";												//$NON-NLS-1$
	String LATEST_EXECUTION				= "LatestExecution";									//$NON-NLS-1$
	String LOCALE						= "Locale";												//$NON-NLS-1$
	String MESSAGE						= "Message";											//$NON-NLS-1$
	String NAME							= "Name";												//$NON-NLS-1$
	String PRESENCE_NAME				= "PresenceName";										//$NON-NLS-1$
	String SCAN_NAME					= "ScanName";											//$NON-NLS-1$
	String SCANNER_TYPE					= "type";												//$NON-NLS-1$
	String STATUS						= "Status";												//$NON-NLS-1$
	String TARGET						= "target";												//$NON-NLS-1$
        String OPEN_SOURCE_ONLY                                 = "openSourceOnly";                                                                     //$NON-NLS-1$
	String VERSION_NUMBER				= "VersionNumber";										//$NON-NLS-1$

	String BINDING_ID					= "Bindingid";											//$NON-NLS-1$
	String KEY_ID						= "KeyId";												//$NON-NLS-1$
	String KEY_SECRET					= "KeySecret";											//$NON-NLS-1$
	String PASSWORD						= "Password";											//$NON-NLS-1$
	String TOKEN						= "Token";												//$NON-NLS-1$
	String USERNAME						= "Username";											//$NON-NLS-1$
	
	String CHARSET 						= "charset"; 											//$NON-NLS-1$
	String UTF8 						= "utf-8";								 				//$NON-NLS-1$
	
	String CONTENT_DISPOSITION 			= "Content-Disposition";				 				//$NON-NLS-1$
	String CONTENT_LENGTH				= "Content-Length";				 						//$NON-NLS-1$
	String CONTENT_TYPE					= "Content-Type";		 								//$NON-NLS-1$
	
	String API_ENV						= "/api/v2";				 							//$NON-NLS-1$
	String API_BLUEMIX					= "Bluemix";					 						//$NON-NLS-1$
	String API_BLUEMIX_LOGIN 			= API_ENV + "/Account/BluemixLogin";					//$NON-NLS-1$
	String API_IBM_LOGIN 				= API_ENV + "/Account/IBMIdLogin";						//$NON-NLS-1$
	String API_KEY_LOGIN				= API_ENV + "/Account/ApiKeyLogin";						//$NON-NLS-1$
	String API_LOGOUT					= API_ENV + "/Account/Logout";							//$NON-NLS-1$
	String API_APPS						= API_ENV + "/Apps"; 									//$NON-NLS-1$
	String API_PRESENCES				= API_ENV + "/Presences";								//$NON-NLS-1$
	String API_PRESENCES_ID				= API_ENV + "/Presences/%s";							//$NON-NLS-1$
	String API_PRESENCES_NEW_KEY		= API_ENV + "/Presences/%s/NewKey";						//$NON-NLS-1$
	String API_BASIC_DETAILS			= API_ENV + "/Scans/%s";								//$NON-NLS-1$
	String API_SCANNER_DETAILS			= API_ENV + "/Scans/&s/&s";								//$NON-NLS-1$
	String API_FILE_UPLOAD				= API_ENV + "/FileUpload";								//$NON-NLS-1$
	String API_SCAN						= API_ENV + "/%s";										//$NON-NLS-1$
	String API_SCANNER					= API_ENV + "/Scans/%s";								//$NON-NLS-1$
	String API_SCANS					= API_ENV + "/Scans";									//$NON-NLS-1$
	String API_NONCOMPLIANT_ISSUES 		= API_ENV + "/Scans/%s/NonCompliantIssues";				//$NON-NLS-1$
	String API_SCANS_REPORT				= API_ENV + "/Scans/%s/Report/%s";						//$NON-NLS-1$
	String API_SCX						= "SCX";                                                               //$NON-NLS-1$
        String API_REPORT_SELECTED_ISSUES       = API_ENV + "/Reports/Security/%s/%s";					//$NON-NLS-1$
        String API_DOWNLOAD_REPORT              = API_ENV + "/Reports/Download/%s";						//$NON-NLS-1$
	String API_SACLIENT_DOWNLOAD		= "/api/%s/StaticAnalyzer/SAClientUtil?os=%s"; 			//$NON-NLS-1$
	String API_SACLIENT_VERSION			= "/api/%s/StaticAnalyzer/SAClientUtil?os=%s&meta=%s"; 	//$NON-NLS-1$
	String API_KEY_PATH					= "/api/ideclientuilogin";								//$NON-NLS-1$
	
	String DEFAULT_RESULT_NAME			= "asoc_results";										//$NON-NLS-1$
	String SACLIENT_INSTALL_DIR			= "SAClientInstall";									//$NON-NLS-1$
	
	String RUNNING						= "Running";											//$NON-NLS-1$
	String READY						= "Ready";												//$NON-NLS-1$
	String FAILED						= "Failed";												//$NON-NLS-1$
	
	String TOTAL_ISSUES					= "NIssuesFound";										//$NON-NLS-1$
	String HIGH_ISSUES					= "NHighIssues";										//$NON-NLS-1$
	String MEDIUM_ISSUES				= "NMediumIssues";										//$NON-NLS-1$
	String LOW_ISSUES					= "NLowIssues";											//$NON-NLS-1$
	String INFO_ISSUES					= "NInfoIssues";										//$NON-NLS-1$
	
	String CREATE_SCAN_SUCCESS			= "message.created.scan";								//$NON-NLS-1$
	String DOWNLOADING_CLIENT			= "message.downloading.client";							//$NON-NLS-1$
	String EXECUTING_SCAN				= "message.running.scan";								//$NON-NLS-1$
	String UPLOADING_FILE				= "message.uploading.file";								//$NON-NLS-1$
	
	String ERROR_AUTHENTICATING			= "error.authenticating";								//$NON-NLS-1$
	String ERROR_DOWNLOADING_CLIENT 	= "error.download.client";								//$NON-NLS-1$
	String ERROR_GETTING_DETAILS		= "error.getting.details";								//$NON-NLS-1$
	String ERROR_GETTING_RESULT			= "error.getting.result";								//$NON-NLS-1$
        String ERROR_GENERATING_REPORT                  = "error.generating.report";                                                            //$NON-NLS-1$
	String ERROR_INVALID_APP			= "error.invalid.app";									//$NON-NLS-1$	
	String ERROR_INVALID_OPTIONS		= "error.invalid.opts";									//$NON-NLS-1$
	String ERROR_LOADING_APPS			= "error.loading.apps";									//$NON-NLS-1$
	String ERROR_LOGIN_EXPIRED			= "login.token.expired";								//$NON-NLS-1$
	String ERROR_INVALID_JOB_ID			= "error.invalid.job.id";								//$NON-NLS-1$
	String ERROR_SUBMITTING_SCAN		= "error.submit.scan";									//$NON-NLS-1$
	String ERROR_UPLOADING_FILE			= "error.upload.file";									//$NON-NLS-1$
}
