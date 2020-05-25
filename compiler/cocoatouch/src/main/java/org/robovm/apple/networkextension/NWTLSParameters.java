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
package org.robovm.apple.networkextension;

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
import org.robovm.apple.security.*;
import org.robovm.apple.network.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NWTLSParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NWTLSParametersPtr extends Ptr<NWTLSParameters, NWTLSParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWTLSParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NWTLSParameters() {}
    protected NWTLSParameters(Handle h, long handle) { super(h, handle); }
    protected NWTLSParameters(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "TLSSessionID")
    public native NSData getTLSSessionID();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setTLSSessionID:")
    public native void setTLSSessionID(NSData v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "SSLCipherSuites")
    public native NSSet<NSNumber> getSSLCipherSuites();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setSSLCipherSuites:")
    public native void setSSLCipherSuites(NSSet<NSNumber> v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "minimumSSLProtocolVersion")
    public native @MachineSizedUInt long getMinimumSSLProtocolVersion();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setMinimumSSLProtocolVersion:")
    public native void setMinimumSSLProtocolVersion(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "maximumSSLProtocolVersion")
    public native @MachineSizedUInt long getMaximumSSLProtocolVersion();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setMaximumSSLProtocolVersion:")
    public native void setMaximumSSLProtocolVersion(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
