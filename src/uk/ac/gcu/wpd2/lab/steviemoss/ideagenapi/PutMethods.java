package uk.ac.gcu.wpd2.lab.steviemoss.ideagenapi;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.*;

public class PutMethods {

    private final String tenantId = "Team18";
    private final String authToken = "ddd8af7c-3e22-4d31-aefa-3e834071c954";


    public static void main(String[] args) throws Exception {

        PutMethods http = new PutMethods();

        System.out.println("Testing 1 - CreateTimeline method ");
        http.createTimeline("12345678", "ID1");
        System.out.println("Testing 2 - Edit Timeline Title method ");
        http.editTitle("2468246", "Event");
        System.out.println("Testing 3 - Delete Timeline method ");
        http.deleteTimeline("135791");
        System.out.println("Testing 4 - LinkEvent method ");
        http.linkEvent("13572", "Event");
        System.out.println("Testing 5 - UnLinkEvent method ");
        http.unlinkEvent("TimelineEventId", "ID3");
        System.out.println("Testing 6 - Create Event method ");
        http.createEvent("ID10101", "ID3", "Delayed Flight", "02/11/18", "Glasgow");
        System.out.println("Testing 7 - Edit Timeline Title method ");
        http.editTimelineTitle("10010001", "ID3");
        System.out.println("Testing 8 - Edit Event Description method ");
        http.editDescription("53463464", "An utter mess it was");
        System.out.println("Testing 9 - Edit Event Location  method ");
        http.editLocation("98876543", "Luton Airport");
        System.out.println("Testing 10 - Edit Event Date and Time method ");
        http.editEventDateTime("543567788", "05/03/2018");
        System.out.println("Testing 11 - Delete Timeline Event method ");
        http.deleteTimelineEvent ("DeleteMe");
        System.out.println("Testing 12 - Link Timeline Events method ");
        http.linkTimelineEvent ("42342423423", "IdLink0001");
        System.out.println("Testing 13 - unLink Timeline Events method ");
        http.unLinkTimelineEvent ("243645645", "IdUnLink0034");
        System.out.println("Testing 14 - Create Timeline Event Attachment method ");
        http.createTimelineEventAttachment ("243647865645", "AttId888834", "Wing Photo" );
        System.out.println("Testing 15 - Edit Timeline Event Attachment method ");
        http.editTitleTimelineEventAttachment( "243647865645", "Wing Photo" );
        System.out.println("Testing 16 - Delete Timeline Event Attachment method ");
        http.deleteTitleTimelineEventAttachment( "243647865645" );
    }

    private void createTimeline(String TimelineEventIdKey, String TimelineEventIdVal) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/Timeline/Create");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();

        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);
        httpCon.setRequestProperty(TimelineEventIdKey, TimelineEventIdVal);
        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineId':'12345678', 'Title':'TimelineTest'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventIdKey: " + TimelineEventIdKey + ", TimelineEventIdVal: " + TimelineEventIdVal);

        StringBuffer response = new StringBuffer();
        System.out.println(httpCon.getOutputStream());
        out.close();
        System.out.println(response.toString());
    }

    //else    {
    //   System.out.println("POST request not worked");
    // }

    private void editTitle(String TimelineEventIdKey, String TimelineEventIdVal) throws Exception {

        //String url = "https://gcu.ideagen-development.com//Timeline/LinkEvent";
        URL url = new URL("https://gcu.ideagen-development.com/Timeline/EditTitle");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);
        httpCon.setRequestProperty(TimelineEventIdKey, TimelineEventIdVal);
        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());

        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineId':'12345678', 'Title':'TimelineTest'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventIdKey: " + TimelineEventIdKey + ", TimelineEventIdVal: " + TimelineEventIdVal);
        //StringBuffer response = new StringBuffer();
        //System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());
        out.close();

    }

    private void deleteTimeline(String TimelineEventIdKey) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/Timeline/Delete");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);
        httpCon.setRequestProperty("TimelineEventId", TimelineEventIdKey);
        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());

        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineEventId':'12345678'}");
        System.out.println("Sending PUT request to: " + url);
        //System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        //System.out.println("TimelineEventIdKey : " + TimelineEventIdKey + " TimelineEventIdVal : " + TimelineEventIdVal);
        out.close();
        System.out.println(httpCon.getOutputStream());
        StringBuffer response = new StringBuffer();
        System.out.println(response.toString());
        out.close();
    }

    private void linkEvent(String TimelineEventIdKey, String TimelineEventIdVal) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/Timeline/LinkEvent");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);
        httpCon.setRequestProperty(TimelineEventIdKey, TimelineEventIdVal);

        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineId':'12345678', 'Title':'TimelineTest'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventIdKey: " + TimelineEventIdKey + ", TimelineEventIdVal: " + TimelineEventIdVal);
        //StringBuffer response = new StringBuffer();
        // System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());
        out.close();
    }

    private void unlinkEvent(String TimelineEventIdKey, String TimelineEventIdVal) throws Exception {
        URL url = new URL("https://gcu.ideagen-development.com/Timeline/UnlinkEvent");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);
        httpCon.setRequestProperty(TimelineEventIdKey, TimelineEventIdVal);

        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineId':'12345678', 'Title':'TimelineTest'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventIdKey: " + TimelineEventIdKey + ", TimelineEventIdVal: " + TimelineEventIdVal);

        //StringBuffer response = new StringBuffer();
        // System.out.println(response.toString());
        //System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());

        out.close();
    }

    private void createEvent(String TimelineEventId, String Title, String Description, String EventDateTime, String Location) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/TimelineEvent/Create");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);
        // httpCon.setRequestProperty(TimelineEventId, Title);

        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineEventId':'Flight Delayed'}");
        //"'Title':'TimelineEvent', 'Description' : 'Flight Delayed', 'EventDateTime' : '02/03/10', 'Location' : 'Glasgow Airport'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventIdKey: " + TimelineEventId + ", Title: " + Title + ", Description: " + Description + ", Event Date: " + EventDateTime + ", Location: " + Location);
        //StringBuffer response = new StringBuffer();
        // System.out.println(response.toString());
        //System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());
        out.close();
    }

    private void editTimelineTitle(String TimelineEventId, String Title) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/TimelineEvent/EditTitle");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);
        // httpCon.setRequestProperty(TimelineEventId, Title);

        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineEventId':'Flight Delayed'}");
        //"'Title':'TimelineEvent', 'Description' : 'Flight Delayed', 'EventDateTime' : '02/03/10', 'Location' : 'Glasgow Airport'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventIdKey: " + TimelineEventId + ", Title: " + Title);
        //StringBuffer response = new StringBuffer();
        // System.out.println(response.toString());
        //System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());
        out.close();
    }

    private void editDescription(String TimelineEventId, String Description) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/TimelineEvent/EditDescription");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);
        // httpCon.setRequestProperty(TimelineEventId, Title);

        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineEventId':'Flight Delayed'}");
        //"'Title':'TimelineEvent', 'Description' : 'Flight Delayed', 'EventDateTime' : '02/03/10', 'Location' : 'Glasgow Airport'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventIdKey: " + TimelineEventId + ", Description: " + Description);
        //StringBuffer response = new StringBuffer();
        // System.out.println(response.toString());
        //System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());
        out.close();
    }

    private void editLocation(String TimelineEventId, String Location) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/TimelineEvent/EditLocation");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);
        // httpCon.setRequestProperty(TimelineEventId, Title);

        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineEventId':'Flight Delayed'}");
        //"'Title':'TimelineEvent', 'Description' : 'Flight Delayed', 'EventDateTime' : '02/03/10', 'Location' : 'Glasgow Airport'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventIdKey: " + TimelineEventId + ", Location: " + Location);
        //StringBuffer response = new StringBuffer();
        // System.out.println(response.toString());
        //System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());
        out.close();
    }

    private void editEventDateTime(String TimelineEventId, String EventDateTime) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/TimelineEvent/EditEventDateTime");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);

        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineEventId':'Flight Delayed'}");
        //"'Title':'TimelineEvent', 'Description' : 'Flight Delayed', 'EventDateTime' : '02/03/10', 'Location' : 'Glasgow Airport'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventIdKey: " + TimelineEventId + ", EventDateTime: " + EventDateTime);
        //StringBuffer response = new StringBuffer();
        // System.out.println(response.toString());
        //System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());
        out.close();
    }

    private void deleteTimelineEvent(String TimelineEventId) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/TimelineEvent/Delete");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);

        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineEventId':'Flight Delayed'}");
        //"'Title':'TimelineEvent', 'Description' : 'Flight Delayed', 'EventDateTime' : '02/03/10', 'Location' : 'Glasgow Airport'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventIdKey: " + TimelineEventId);
        //StringBuffer response = new StringBuffer();
        // System.out.println(response.toString());
        //System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());
        out.close();
    }

    private void linkTimelineEvent(String TimelineEventId, String LinkedToTimelineEventId) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/TimelineEvent/LinkEvents");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);

        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineEventId':'Flight Delayed'}");
        //"'Title':'TimelineEvent', 'Description' : 'Flight Delayed', 'EventDateTime' : '02/03/10', 'Location' : 'Glasgow Airport'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventIdKey: " + TimelineEventId + ", Link To Timeline Events: " + LinkedToTimelineEventId );
        //StringBuffer response = new StringBuffer();
        // System.out.println(response.toString());
        //System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());
        out.close();
    }

    private void unLinkTimelineEvent(String TimelineEventId, String UnLinkedFromTimelineEventId) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/TimelineEvent/UnLinkEvents");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);

        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineEventId':'Flight Delayed'}");
        //"'Title':'TimelineEvent', 'Description' : 'Flight Delayed', 'EventDateTime' : '02/03/10', 'Location' : 'Glasgow Airport'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventIdKey: " + TimelineEventId + "Link To Timeline Events:" + UnLinkedFromTimelineEventId );
        //StringBuffer response = new StringBuffer();
        // System.out.println(response.toString());
        //System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());
        out.close();
    }

    private void createTimelineEventAttachment (String TimelineEventId, String AttachmentId, String Title) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/TimelineEventAttachment/Create");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);

        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineEventId':'Flight Delayed'}");
        //"'Title':'TimelineEvent', 'Description' : 'Flight Delayed', 'EventDateTime' : '02/03/10', 'Location' : 'Glasgow Airport'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventId: " + TimelineEventId + ", Attachment Id: " + AttachmentId + ", Title: " + Title );
        //StringBuffer response = new StringBuffer();
        // System.out.println(response.toString());
        //System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());
        out.close();
    }

    private void editTitleTimelineEventAttachment (String TimelineEventId, String Title) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/TimelineEventAttachment/Create");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);

        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineEventId':'Flight Delayed'}");
        //"'Title':'TimelineEvent', 'Description' : 'Flight Delayed', 'EventDateTime' : '02/03/10', 'Location' : 'Glasgow Airport'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("TimelineEventId: " + TimelineEventId + ", Title: " + Title );
        //StringBuffer response = new StringBuffer();
        // System.out.println(response.toString());
        //System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());
        out.close();
    }

    private void deleteTitleTimelineEventAttachment (String AttachmentId) throws Exception {

        URL url = new URL("https://gcu.ideagen-development.com/TimelineEventAttachment/Delete");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        httpCon.setRequestProperty("tenantId", tenantId);
        httpCon.setRequestProperty("AuthToken", authToken);

        OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
        out.write("{'TenantId':'Team18', 'AuthToken':'ddd8af7c-3e22-4d31-aefa-3e834071c954', 'TimelineEventId':'Flight Delayed'}");
        //"'Title':'TimelineEvent', 'Description' : 'Flight Delayed', 'EventDateTime' : '02/03/10', 'Location' : 'Glasgow Airport'}");
        System.out.println("Sending PUT request to: " + url);
        System.out.println("TenantId : " + tenantId + " AuthToken : " + authToken);
        System.out.println("AttachmentId: " + AttachmentId );
        //StringBuffer response = new StringBuffer();
        // System.out.println(response.toString());
        //System.out.println(response.toString());
        System.out.println(httpCon.getOutputStream());
        out.close();
    }
}



