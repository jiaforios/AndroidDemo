package airmonitor.com.androiddemo;

/**
 * Created by admina on 2017/10/20.
 * https://kidwatch01.hojy.com/hgts/api/acountLogin?mobile=18682047063&password=52d4a83215565368f94d3e340e7125e7
 */

public class Model extends Object {

    /**
     * resultMsg : 请求成功，无任何异常
     * result : {"imgUrl":null,"birthday":null,"acountName":"18682047063","address":null,"email":null,"nickName":null,"token":"daa2c459-dc12-4487-accb-73c37eacb5c4","gender":0,"acountId":287}
     * time : 1508482011651
     * errorCode : 0
     * resultCode : 80000
     */

    private String resultMsg;
    private ResultBean result;
    private long time;
    private int errorCode;
    private int resultCode;

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public static class ResultBean {
        /**
         * imgUrl : null
         * birthday : null
         * acountName : 18682047063
         * address : null
         * email : null
         * nickName : null
         * token : daa2c459-dc12-4487-accb-73c37eacb5c4
         * gender : 0
         * acountId : 287
         */

        private Object imgUrl;
        private Object birthday;
        private String acountName;
        private Object address;
        private Object email;
        private Object nickName;
        private String token;
        private int gender;
        private int acountId;

        public Object getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(Object imgUrl) {
            this.imgUrl = imgUrl;
        }

        public Object getBirthday() {
            return birthday;
        }

        public void setBirthday(Object birthday) {
            this.birthday = birthday;
        }

        public String getAcountName() {
            return acountName;
        }

        public void setAcountName(String acountName) {
            this.acountName = acountName;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getEmail() {
            return email;
        }

        public void setEmail(Object email) {
            this.email = email;
        }

        public Object getNickName() {
            return nickName;
        }

        public void setNickName(Object nickName) {
            this.nickName = nickName;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public int getAcountId() {
            return acountId;
        }

        public void setAcountId(int acountId) {
            this.acountId = acountId;
        }
    }
}
