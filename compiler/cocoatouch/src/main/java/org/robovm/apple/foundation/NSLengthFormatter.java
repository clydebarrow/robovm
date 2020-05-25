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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSLengthFormatter/*</name>*/ 
    extends /*<extends>*/NSFormatter/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSLengthFormatterPtr extends Ptr<NSLengthFormatter, NSLengthFormatterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSLengthFormatter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSLengthFormatter() {}
    protected NSLengthFormatter(Handle h, long handle) { super(h, handle); }
    protected NSLengthFormatter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "numberFormatter")
    public native NSNumberFormatter getNumberFormatter();
    @Property(selector = "setNumberFormatter:")
    public native void setNumberFormatter(NSNumberFormatter v);
    @Property(selector = "unitStyle")
    public native NSFormattingUnitStyle getUnitStyle();
    @Property(selector = "setUnitStyle:")
    public native void setUnitStyle(NSFormattingUnitStyle v);
    @Property(selector = "isForPersonHeightUse")
    public native boolean isForPersonHeightUse();
    @Property(selector = "setForPersonHeightUse:")
    public native void setForPersonHeightUse(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public String formatUnitMeters(double numberInMeters) {
        return formatUnitMeters(numberInMeters, new MachineSizedSIntPtr());
    }
    /*<methods>*/
    @Method(selector = "stringFromValue:unit:")
    public native String format(double value, NSLengthFormatterUnit unit);
    @Method(selector = "stringFromMeters:")
    public native String formatMeters(double numberInMeters);
    @Method(selector = "unitStringFromValue:unit:")
    public native String formatUnit(double value, NSLengthFormatterUnit unit);
    @Method(selector = "unitStringFromMeters:usedUnit:")
    protected native String formatUnitMeters(double numberInMeters, MachineSizedSIntPtr unitp);
    /*</methods>*/
}
