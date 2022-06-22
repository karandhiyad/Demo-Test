package com.example.demotest;

public class SwitchModel {
    String SwitchName,SwitchNumber;

    public SwitchModel(String switchName, String switchNumber) {
        SwitchName = switchName;
        SwitchNumber = switchNumber;
    }

    public String getSwitchName() {
        return SwitchName;
    }

    public void setSwitchName(String switchName) {
        SwitchName = switchName;
    }

    public String getSwitchNumber() {
        return SwitchNumber;
    }

    public void setSwitchNumber(String switchNumber) {
        SwitchNumber = switchNumber;
    }
}
