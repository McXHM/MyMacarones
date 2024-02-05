package gameutils;

/**
 * 一个经验系统，保存了等级以及零散经验
 */
public class Exps {
    /**
     * 等级
     */
    public int level;
    /**
     * 经验
     */
    public float exp;

    /**
     * 初始化构造函数
     * 返回一个等级、经验均为0的经验系统
     */
    public Exps() {
        level = 0;
        exp = 0;
    }

    /**
     * 构造函数扩展
     *
     * @param level 等级
     * @param exp   经验
     */

    public Exps(int level, float exp) {
        this.level = level;
        this.exp = exp;
    }

    /**
     * 用经验值计算等级系统的全局方法
     *
     * @param exp 经验值
     * @return 等级系统
     */
    public static Exps calExps(float exp) {
        int newLevel = 0;
        float newExp = exp;
        for (int i = 0; newExp - (i * 8) >= 0; i++) {
            newExp -= (i * 8);
            newLevel++;
        }
        return new Exps(newLevel, newExp);
    }

    /**
     * 计算等级系统的全部经验值花费
     *
     * @param exps 等级系统
     * @return 经验值
     */
    public static float calAllExp(Exps exps) {
        int oldLevel = exps.level;
        float newExp = 0;
        while (oldLevel - 1 >= 0) {
            newExp += Math.pow(2, oldLevel);
            oldLevel--;
        }
        return newExp + exps.exp;
    }

    /**
     * 计算等级系统升到下一级所需经验的全局方法
     *
     * @param exps 等级系统
     * @return 经验值
     */
    public static float nextLevel(Exps exps) {
        return (float) (Math.pow(2, exps.level) - exps.exp);
    }

    /**
     * 计算该马卡龙的等级系统升到下一级所需经验值
     *
     * @return 经验值
     */
    public float nextLevel() {
        return (float) (Math.pow(2, level) - exp);
    }

}
