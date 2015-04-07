package com.nightscout.core.preferences;

import com.nightscout.core.drivers.SupportedDevices;
import com.nightscout.core.model.GlucoseUnit;

import java.util.ArrayList;
import java.util.List;

public class TestPreferences implements NightscoutPreferences {
    private boolean restApiEnabled = false;
    private List<String> restApiBaseUris = new ArrayList<>();
    private boolean calibrationUploadEnabled = false;
    private boolean sensorUploadEnabled = false;
    private boolean rawUploadEnabled = false;
    private boolean mongoUploadEnabled = false;
    private boolean mqttUploadEnabled = false;
    private String mongoClientUri = null;
    private String mongoCollection = "entries";
    private String mongoDeviceStatusCollection = "devicestatus";
    private boolean dataDonateEnabled;
    private GlucoseUnit units;
    private String pwdName;
    private boolean understand;
    private boolean askedForData;
    private String mqttEndpoint;
    private String serialNumber;
    private boolean mgbUploadEnabled = false;
    private String btAddress = null;
    private String btDeviceName = null;

    @Override
    public boolean isRestApiEnabled() {
        return restApiEnabled;
    }

    @Override
    public void setRestApiEnabled(boolean restApiEnabled) {
        this.restApiEnabled = restApiEnabled;
    }

    @Override
    public GlucoseUnit getPreferredUnits() {
        return units;
    }

    @Override
    public void setPreferredUnits(GlucoseUnit units) {
        this.units = units;
    }

    @Override
    public List<String> getRestApiBaseUris() {
        return restApiBaseUris;
    }

    @Override
    public void setRestApiBaseUris(List<String> restApiBaseUris) {
        this.restApiBaseUris = restApiBaseUris;
    }

    @Override
    public boolean isCalibrationUploadEnabled() {
        return calibrationUploadEnabled;
    }

    @Override
    public void setCalibrationUploadEnabled(boolean calibrationUploadEnabled) {
        this.calibrationUploadEnabled = calibrationUploadEnabled;
    }

    @Override
    public boolean isSensorUploadEnabled() {
        return sensorUploadEnabled;
    }

    @Override
    public void setSensorUploadEnabled(boolean sensorUploadEnabled) {
        this.sensorUploadEnabled = sensorUploadEnabled;
    }

    @Override
    public boolean isRawEnabled() {
        return rawUploadEnabled;
    }

    @Override
    public void setRawEnabled(boolean rawUploadEnabled) {
        this.rawUploadEnabled = rawUploadEnabled;
    }

    @Override
    public boolean isMongoUploadEnabled() {
        return mongoUploadEnabled;
    }

    @Override
    public boolean isDataDonateEnabled() {
        return dataDonateEnabled;
    }

    @Override
    public void setDataDonateEnabled(boolean toDonate) {
        this.dataDonateEnabled = toDonate;
    }

    @Override
    public void setMongoUploadEnabled(boolean mongoUploadEnabled) {
        this.mongoUploadEnabled = mongoUploadEnabled;
    }

    @Override
    public String getMongoClientUri() {
        return mongoClientUri;
    }

    @Override
    public void setMongoClientUri(String mongoClientUri) {
        this.mongoClientUri = mongoClientUri;
    }

    @Override
    public String getMongoCollection() {
        return mongoCollection;
    }

    @Override
    public void setMongoCollection(String mongoCollection) {
        this.mongoCollection = mongoCollection;
    }

    @Override
    public String getMongoDeviceStatusCollection() {
        return mongoDeviceStatusCollection;
    }

    @Override
    public boolean isMqttEnabled() {
        return mqttUploadEnabled;
    }

    @Override
    public void setMqttUploadEnabled(boolean mqttUploadEnabled) {
        this.mqttUploadEnabled = mqttUploadEnabled;
    }

    @Override
    public String getMqttEndpoint() {
        return mqttEndpoint;
    }

    @Override
    public void setMqttEndpoint(String endpoint) {
        mqttEndpoint = endpoint;
    }

    @Override
    public String getMqttUser() {
        return null;
    }

    @Override
    public String getMqttPass() {
        return null;
    }

    @Override
    public boolean getIUnderstand() {
        return understand;
    }

    @Override
    public void setIUnderstand(boolean bool) {
        understand = bool;
    }

    @Override
    public void setMongoDeviceStatusCollection(String mongoDeviceStatusCollection) {
        this.mongoDeviceStatusCollection = mongoDeviceStatusCollection;
    }

    @Override
    public void setPwdName(String pwdName) {
        this.pwdName = pwdName;
    }

    @Override
    public boolean hasAskedForData() {
        return askedForData;
    }

    @Override
    public void setAskedForData(boolean askedForData) {
        this.askedForData = askedForData;
    }

    // TODO Implement these
    @Override
    public SupportedDevices getDeviceType() {
        return SupportedDevices.UNKNOWN;
    }

    // TODO Implement these
    @Override
    public void setBluetoothDevice(String btDeviceName, String btAddress) {
        this.btAddress = btAddress;
        this.btDeviceName = btDeviceName;
    }

    // TODO Implement these
    @Override
    public String getBtAddress() {
        return this.btAddress;
    }

    @Override
    public String getShareSerial() {
        return this.serialNumber;
    }

    @Override
    public void setShareSerial(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean isMeterUploadEnabled() {
        return mgbUploadEnabled;
    }

    @Override
    public void setMeterUploadEnabled(boolean enabled) {
        mgbUploadEnabled = enabled;
    }

    @Override
    public boolean isInsertionUploadEnabled() {
        return false;
    }

    @Override
    public void setInsertionUploadEnabled(boolean enabled) {

    }

    @Override
    public long getLastMeterSysTime() {
        return 0;
    }

    @Override
    public void setLastMeterSysTime(long meterSysTime) {

    }

    @Override
    public long getLastEgvSysTime() {
        return 0;
    }

    @Override
    public void setLastEgvSysTime(long egvSysTime) {

    }

    @Override
    public String getPwdName() {
        return pwdName;
    }
}
