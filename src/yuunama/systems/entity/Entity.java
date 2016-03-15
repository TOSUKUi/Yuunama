package yuunama.systems.entity;

import com.sun.org.apache.xerces.internal.impl.dv.xs.BooleanDV;
import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by TOSUKUi on 2016/03/16.
 */
public class Entity {
    /**
     * Entityのヒットポイントを示す数値
     */
    private Integer hp;
    /**
     * Entityのマナ値を示す値
     */
    private Integer mp;
    /**
     * Entityの移動速度を示す数値
     */
    private Integer speed;

    /**
     * Entityの移動可能かどうかを示す真理値
     */
    private Boolean movable;
    /**
     * Entityの攻撃力
     */
    private Integer attack;
    /**
     * Entityの防御力
     */
    private Integer defend;


    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getMp() {
        return mp;
    }

    public Integer getSpeed() {
        return speed;
    }

    /**
     * 何かに攻撃される際、その何かが呼び出すメソッド
     * @param attack 相手が算出した攻撃力
     */
    public Integer attacked(Integer attack){
        Integer trueattack = attack - this.defend;
        this.hp = this.hp - trueattack;
        return trueattack;
    }

    private Integer attack(){
        return attacked(this.attack);
    }

}
