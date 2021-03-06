/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.metal;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLRenderPassStencilAttachmentDescriptor/*</name>*/ 
    extends /*<extends>*/MTLRenderPassAttachmentDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLRenderPassStencilAttachmentDescriptorPtr extends Ptr<MTLRenderPassStencilAttachmentDescriptor, MTLRenderPassStencilAttachmentDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLRenderPassStencilAttachmentDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLRenderPassStencilAttachmentDescriptor() {}
    protected MTLRenderPassStencilAttachmentDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLRenderPassStencilAttachmentDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "clearStencil")
    public native int getClearStencil();
    @Property(selector = "setClearStencil:")
    public native void setClearStencil(int v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "stencilResolveFilter")
    public native MTLMultisampleStencilResolveFilter getStencilResolveFilter();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setStencilResolveFilter:")
    public native void setStencilResolveFilter(MTLMultisampleStencilResolveFilter v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
