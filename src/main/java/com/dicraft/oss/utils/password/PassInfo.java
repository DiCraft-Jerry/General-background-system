package com.dicraft.oss.utils.password;

/**
 * @author: DiCraft
 * @Date: 2022/9/21 14:56
 * @package: com.dicraft.oss.utils.password
 * @Version: 1.0
 * @Decsription: 密码实体
 */
public class PassInfo {

    /**
     * 密码随机串码
     */
    private String salt;

    /**
     * MD5后的密码
     */
    private String password;

    public PassInfo(String salt, String password) {
        super();
        this.salt = salt;
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
