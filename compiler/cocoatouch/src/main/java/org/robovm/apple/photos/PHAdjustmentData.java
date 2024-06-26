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
package org.robovm.apple.photos;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHAdjustmentData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHAdjustmentDataPtr extends Ptr<PHAdjustmentData, PHAdjustmentDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHAdjustmentData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHAdjustmentData() {}
    protected PHAdjustmentData(Handle h, long handle) { super(h, handle); }
    protected PHAdjustmentData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFormatIdentifier:formatVersion:data:")
    public PHAdjustmentData(String formatIdentifier, String formatVersion, NSData data) { super((SkipInit) null); initObject(init(formatIdentifier, formatVersion, data)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "formatIdentifier")
    public native String getFormatIdentifier();
    @Property(selector = "formatVersion")
    public native String getFormatVersion();
    @Property(selector = "data")
    public native NSData getData();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFormatIdentifier:formatVersion:data:")
    protected native @Pointer long init(String formatIdentifier, String formatVersion, NSData data);
    /*</methods>*/
}
