package com.tiscon.form;

import com.tiscon.validator.Numeric;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 顧客が入力する見積もり情報を保持するクラス。
 *
 * @author Oikawa Yumi
 */
public class UserOrderForm {

    @NotBlank(message = "名前を入力してください")
    private String customerName;

    @NotBlank(message = "電話番号を入力してください")
    @Numeric(message = "半角数字で入力してください")
    private String tel;

    @Email(message = "有効なメールアドレスを入力してください")
    @NotBlank(message = "メールアドレスを入力してください")
    private String email;

    @NotBlank(message = "集荷元住所(都道府県)を選択してください")
    private String oldPrefectureId;

    @NotBlank(message = "集荷元住所(市区町村以下)を入力してください")
    private String oldAddress;

    @NotBlank(message = "お届け先住所(都道府県)を選択してください")
    private String newPrefectureId;

    @NotBlank(message = "お届け先住所(市区町村以下)を入力してください")
    private String newAddress;

    @Numeric(message = "半角数字で入力してください")
    @NotBlank(message = "段ボールの個数を入力してください")
    private String box;

    @Numeric(message = "半角数字で入力してください")
    @NotBlank(message = "ベッドの個数を入力してください")
    private String bed;

    @Numeric(message = "半角数字で入力してください")
    @NotBlank(message = "自転車の個数を入力してください")
    private String bicycle;

    @Numeric(message = "半角数字で入力してください")
    @NotBlank(message = "洗濯機の個数を入力してください")
    private String washingMachine;

    @NotNull
    private boolean washingMachineInstallation;

    @Numeric(message = "半角数字で入力してください")
    @NotBlank(message = "引っ越し月を入力してください")
    private String monthMoving;

    @Numeric(message = "半角数字で入力してください")
    @NotBlank(message = "引っ越し日を入力してください")
    private String dayMoving;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBicycle() {
        return bicycle;
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;
    }

    public String getMonthMoving() {
        return monthMoving;
    }

    public void setMonthMoving(String monthMoving) {
        this.monthMoving = monthMoving;
    }

    public String getDayMoving() {
        return dayMoving;
    }

    public void setDayMoving(String dayMoving) {
        this.dayMoving = dayMoving;
    }
}
