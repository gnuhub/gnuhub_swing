package com.gnuhub.swing;

/**
 * Created by stallman on 14-4-29.
 */
// 导入需要的类
// 学习类库 http://tool.oschina.net/uploads/apidocs/jdk-zh/javax/swing/package-summary.html
import javax.swing.*;

public class Main {
    public static void main(String[] args){
        // http://tool.oschina.net/uploads/apidocs/jdk-zh/javax/swing/SwingUtilities.html
        // 通常 Swing 不是线程安全的。除非另行说明，否则所有 Swing 组件及相关类都必须在事件调度线程上访问。
        Runnable doRun;
        javax.swing.SwingUtilities.invokeLater(doRun);
    }
}
