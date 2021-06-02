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
package org.robovm.apple.corefoundation;

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
import org.robovm.apple.coreservices.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/CFBundleExecutableArchitectureType/*</name>*/ implements ValuedEnum {
	ARM(12L),
    /*<values>*/
    I386(7L),
    PPC(18L),
    X86_64(16777223L),
    PPC64(16777234L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    ARM64(16777228L);
    /*</values>*/

    private final long n;

    private /*<name>*/CFBundleExecutableArchitectureType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CFBundleExecutableArchitectureType/*</name>*/ valueOf(long n) {
        for (/*<name>*/CFBundleExecutableArchitectureType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/CFBundleExecutableArchitectureType/*</name>*/.class.getName());
    }
}
