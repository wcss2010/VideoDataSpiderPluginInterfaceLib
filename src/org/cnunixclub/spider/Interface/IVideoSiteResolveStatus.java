/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cnunixclub.spider.Interface;

/**
 *
 * @author wcss
 */
public interface IVideoSiteResolveStatus
{
    public void processResolveStatus(IVideoSiteResolveAdapter sender,int stateCode,String text);    
}
