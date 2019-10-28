/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.libimobiledevice.binding;

public class LongOut {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LongOut(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LongOut obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LibIMobileDeviceJNI.delete_LongOut(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public long getValue() {
    return LibIMobileDeviceJNI.LongOut_value_get(swigCPtr, this);
  }

  public LongOut() {
    this(LibIMobileDeviceJNI.new_LongOut(), true);
  }

}
