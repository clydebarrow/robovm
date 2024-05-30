/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.libimobiledevice.binding;

public class AfcClientRefOut {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AfcClientRefOut(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AfcClientRefOut obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(AfcClientRefOut obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LibIMobileDeviceJNI.delete_AfcClientRefOut(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AfcClientRef getValue() {
    long cPtr = LibIMobileDeviceJNI.AfcClientRefOut_value_get(swigCPtr, this);
    return (cPtr == 0) ? null : new AfcClientRef(cPtr, false);
  }

  public AfcClientRefOut() {
    this(LibIMobileDeviceJNI.new_AfcClientRefOut(), true);
  }

}
