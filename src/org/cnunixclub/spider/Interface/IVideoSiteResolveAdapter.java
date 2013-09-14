/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cnunixclub.spider.Interface;

import org.cnunixclub.spider.Interface.model.*;

/**
 * 视频网站解析适配器
 * @author wcss
 */
public interface IVideoSiteResolveAdapter
{
    /**
     * 适配器名称
     */
    public String name = "";
    
    /**
     * 当前站点地址
     */
    public String currentSiteUrl = "";
    
    /**
     * 视频格式
     */
    public String videoFormat = "";
    
    /**
     * 附加数据
     */
    public Object tag = null;
    
    /**
     * 解析状态事件
     */
    public IVideoSiteResolveStatus resolveStatusEvent = null;
    
    /**
     * 投递解析状态事件
     * @param stateCode
     * @param txt 
     */
    public void processResolveStatus(int stateCode,String txt);
    
    /**
     * 获得默认字符编码
     * @param url
     * @return 
     */
    public String getEncoding();
    
    /**
     * 获得本插件支持的网站列表
     * @return 
     */
    public String[] getSupportVideoSiteUrlList();
    
    /**
     * 获得频道信息列表
     * @param content
     * @return 
     */
    public VideoChannelInfo[] getChannelList(String content);
    
    /**
     * 获得频道内容链接列表
     * @param content
     * @return 
     */
    public String[] getChannelContentURLList(String content);
    
    /**
     * 获得视频说明对象
     * @param content
     * @return 
     */
    public VideoInfo getVideoInfoObj(String content);
    
    /**
     * 获得视频链接列表
     * @param content
     * @return 
     */
    public String[] getVideUrlList(String content,String videoUrlType);
    
    /**
     * 设置数据库连接字符串
     * @param dbUrl 
     */
    public void setDBUrl(String dbUrl,String user,String pwd);
    
    /**
     * 初始化函数
     */
    public void init();
    
    /**
     * 解析网页数据
     * @param cmd
     * @param data 
     */
    public void resolve(String cmd,String data);    
}
