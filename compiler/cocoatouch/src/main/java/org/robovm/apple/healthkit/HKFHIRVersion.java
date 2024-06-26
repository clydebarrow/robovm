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
package org.robovm.apple.healthkit;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKFHIRVersion/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class HKFHIRVersionPtr extends Ptr<HKFHIRVersion, HKFHIRVersionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKFHIRVersion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKFHIRVersion() {}
    protected HKFHIRVersion(Handle h, long handle) { super(h, handle); }
    protected HKFHIRVersion(SkipInit skipInit) { super(skipInit); }
    public HKFHIRVersion(String versionString) throws NSErrorException {
       this(versionString, new NSError.NSErrorPtr());
    }
    private HKFHIRVersion(String versionString, NSError.NSErrorPtr ptr) throws NSErrorException {
       super((Handle) null, create(versionString, ptr));
       retain(getHandle());
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    @Method(selector = "initWithCoder:")
    public HKFHIRVersion(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "majorVersion")
    public native @MachineSizedSInt long getMajorVersion();
    @Property(selector = "minorVersion")
    public native @MachineSizedSInt long getMinorVersion();
    @Property(selector = "patchVersion")
    public native @MachineSizedSInt long getPatchVersion();
    @Property(selector = "FHIRRelease")
    public native HKFHIRRelease getFHIRRelease();
    @Property(selector = "stringRepresentation")
    public native String getStringRepresentation();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "versionFromVersionString:error:")
    protected static native @Pointer long create(String versionString, NSError.NSErrorPtr errorOut);
    @Method(selector = "primaryDSTU2Version")
    public static native HKFHIRVersion primaryDSTU2Version();
    @Method(selector = "primaryR4Version")
    public static native HKFHIRVersion primaryR4Version();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
