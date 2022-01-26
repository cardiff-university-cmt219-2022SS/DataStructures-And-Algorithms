package cn.allwayz.Algorithm.sort;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 排序是将一组数据，依照指定的顺序进行排列的过程<br><hr>
 * <b>排序的分类</b><br>
 * <ol>
 *     <li>内部排序<br>指将需要处理的所有数据都加载到内部存储器中进行排序</li>
 *     <li>外部排序法<br>数据量过大，无法全部加载到内存中，需要借助外部存储进行排序。</li>
 *     <li>
 *         常见排序算法
 *         <ul>
 *             <li>插入排序：直接插入排序 / 希尔排序</li>
 *             <li>选择排序：简单选择排序 / 堆排序</li>
 *             <li>交换排序：冒泡排序 / 快速排序</li>
 *             <li>归并排序</li>
 *             <li>基数排序</li>
 *         </ul>
 *     </li>
 * </ol>
 * <hr>
 * <b>度量一个程序(算法)执行时间的两种方法</b>
 * <ol>
 *     <li>事后统计的方法: <br>
 *     这种方法可行，但是有两个问题：一是要想对设计的算的运行性进行评测，需要实际运行该程序；
 *     二是所得时间的统计量依赖于计算机的软、硬件等环境因素，这种方式，
 *     要在同一台计算机的相同状态下运行，才能比较那个算法速度更快   </li>
 *     <li>事前估算的方法: <br>通过分析某个算法的时间复杂度来判断哪个算法更优</li>
 * </ol>
 *
 * <ul>
 *     <li>常数阶 O(1)</li>
 *     <li>对数阶 O(log<sub>2</sub>n)</li>
 *     <li>线性阶 O(n)</li>
 *     <li>线性对数阶 O(nlog<sub>2</sub>n)</li>
 *     <li>平方阶 O(n<sup>2</sup>)</li>
 *     <li>立方阶 O(n<sup>3</sup>)</li>
 *     <li>k次方阶 O(n<sup>k</sup>)</li>
 *     <li>指数阶 O(2<sup>n</sup>)</li>
 * </ul>
 *
 * @author allwayz
 * @create 2022-01-22 04:13
 */
public class SortAlgorithmStarter {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
    }

}
