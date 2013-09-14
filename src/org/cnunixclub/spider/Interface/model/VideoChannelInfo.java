/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cnunixclub.spider.Interface.model;

/**
 * 频道信息
 * @author wcss
 */
public class VideoChannelInfo
{
    public VideoChannelInfo(String u,String n)
    {
        this.url = u;
        this.name = n;
    }
    public String url;
    public String name;    
}
