package gameobjects;

import gameutils.Exps;

/**
 * 一个马卡龙
 */
public class Macarone {
    /**
     * 名字
     */
    public String name;
    /**
     * 口味
     */
    public String taste;
    /**
     * 等级系统
     */
    public Exps exps;

    /**
     * 添加经验的方法
     *
     * @param value 经验值
     */
    public void addExp(float value) {
        this.exps = Exps.calExps(Exps.calAllExp(this.exps) + value);
    }

    /**
     * 添加经验的全局方法
     *
     * @param macarone 马卡龙
     * @param value    经验
     */
    public static void addExp(Macarone macarone, float value) {
        macarone.addExp(value);
    }

    /**
     * 设置经验的方法
     *
     * @param exp 经验值
     */
    public void setExp(float exp) {
        this.exps = Exps.calExps(exp);
    }

    /**
     * 设置经验的全局方法
     *
     * @param macarone 马卡龙
     * @param exp      经验
     */
    public static void setExp(Macarone macarone, float exp) {
        macarone.setExp(exp);
    }

    /**
     * 设置经验的方法
     *
     * @param level 等级
     */
    public void setExp(int level) {
        this.exps = new Exps(level, 0);
    }

    /**
     * 设置经验的全局方法
     *
     * @param macarone 马卡龙
     * @param level    等级
     */
    public static void setExp(Macarone macarone, int level) {
        macarone.setExp(level);
    }

    /**
     * 设置经验的方法
     *
     * @param level 等级
     * @param exp   经验
     */
    public void setExp(int level, float exp) {
        this.exps = new Exps(level, exp);
    }

    /**
     * 设置经验的全局方法
     *
     * @param macarone 马卡龙
     * @param level    等级
     * @param exp      经验
     */
    public static void setExp(Macarone macarone, int level, float exp) {
        macarone.setExp(level, exp);
    }

    /**
     * 获取名字的方法
     *
     * @return 该马卡龙的名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字的方法（不推荐）
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取口味的方法
     *
     * @return 该马卡龙的口味
     */
    public String getTaste() {
        return taste;
    }

    /**
     * 设置口味的方法
     *
     * @param taste 口味
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }

    /**
     * 获取经验系统的方法
     *
     * @return 该马卡龙的经验系统
     */
    public Exps getExps() {
        return exps;
    }

    /**
     * 设置经验系统的方法
     *
     * @param exps 经验系统
     */
    public void setExps(Exps exps) {
        this.exps = exps;
    }
}
