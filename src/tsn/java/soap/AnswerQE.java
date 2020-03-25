package tsn.java.soap;

import java.io.Serializable;

// Указываем через Serializable что класс будет способен работать в web-технологии SOAP
// ДЛЯ КАЖДОГО ПОЛЯ НУЖНЫ СЕТТЕРЫ И ГЕТТЕРЫ, А ТАКЖЕ ОБЪЗАТЕЛЕН ПУСТОЙ КОНСТРУКТОР !
public class AnswerQE implements Serializable {
    private double x1;
    private double x2;

    public AnswerQE() {
    }

    public AnswerQE(double x1, double x2) {
        this.x1 = x1; this.x2 = x2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }
    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    @Override
    public String toString() {
        return "x1=" + x1 + ", x2=" + x2;
    }

}
