/**
 * Generated by Agitar build: AgitarOne Version 5.3.0.000022 (Build date: Jan 04, 2012) [5.3.0.000022]
 * JDK Version: 1.6.0_14
 *
 * Generated on 29 Jul, 2013 2:32:56 PM
 * Time to generate: 00:22.651 seconds
 *
 */

package com.huawei.unibi.molap.datastorage.store.compression;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.iweb.platform.logging.LogService;
import com.huawei.unibi.molap.util.MolapCoreLogEvent;
import java.io.IOException;
import org.xerial.snappy.Snappy;

public class SnappyCompressionAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return SnappyCompression.class;
    }
    
    public void testConstructor() throws Throwable {
        new SnappyCompression();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testSnappyByteCompressionUnCompressWithAggressiveMocks() throws Throwable {
        SnappyCompression.SnappyByteCompression snappyByteCompression = (SnappyCompression.SnappyByteCompression) Mockingbird.getProxyObject(SnappyCompression.SnappyByteCompression.class, true);
        byte[] bytes = new byte[0];
        byte[] bytes2 = new byte[0];
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(Snappy.uncompress(bytes), bytes2);
        Mockingbird.enterTestMode(SnappyCompression.SnappyByteCompression.class);
        byte[] result = snappyByteCompression.unCompress(bytes);
        assertEquals("result.length", 0, result.length);
    }
    
    public void testSnappyByteCompressionUnCompressWithAggressiveMocks1() throws Throwable {
        storeStaticField(SnappyCompression.class, "LOGGER");
        storeStaticField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG");
        SnappyCompression.SnappyByteCompression snappyByteCompression = (SnappyCompression.SnappyByteCompression) Mockingbird.getProxyObject(SnappyCompression.SnappyByteCompression.class, true);
        byte[] bytes = new byte[0];
        IOException iOException = (IOException) Mockingbird.getProxyObject(IOException.class);
        LogService logService = (LogService) Mockingbird.getProxyObject(LogService.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(Snappy.uncompress(bytes), iOException);
        setPrivateField(SnappyCompression.class, "LOGGER", logService);
        setPrivateField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG", null);
        Mockingbird.setReturnValue(false, iOException, "getMessage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, logService, "error", "(com.huawei.iweb.platform.logging.LogEvent,java.lang.Throwable,java.lang.Object[])void", null, 1);
        Mockingbird.enterTestMode(SnappyCompression.SnappyByteCompression.class);
        byte[] result = snappyByteCompression.unCompress(bytes);
        assertEquals("result.length", 0, result.length);
    }
    
    public void testSnappyByteCompressionValueOf() throws Throwable {
        SnappyCompression.SnappyByteCompression result = SnappyCompression.SnappyByteCompression.valueOf("INSTANCE");
        assertEquals("result", SnappyCompression.SnappyByteCompression.INSTANCE, result);
    }
    
    public void testSnappyByteCompressionValues() throws Throwable {
        SnappyCompression.SnappyByteCompression[] result = SnappyCompression.SnappyByteCompression.values();
        assertEquals("result.length", 1, result.length);
        assertEquals("result[0]", SnappyCompression.SnappyByteCompression.INSTANCE, result[0]);
    }
    
    public void testSnappyDoubleCompressionUnCompressWithAggressiveMocks() throws Throwable {
        SnappyCompression.SnappyDoubleCompression snappyDoubleCompression = (SnappyCompression.SnappyDoubleCompression) Mockingbird.getProxyObject(SnappyCompression.SnappyDoubleCompression.class, true);
        byte[] bytes = new byte[0];
        double[] doubles = new double[0];
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(Snappy.uncompressDoubleArray(bytes), doubles);
        Mockingbird.enterTestMode(SnappyCompression.SnappyDoubleCompression.class);
        double[] result = snappyDoubleCompression.unCompress(bytes);
        assertEquals("result.length", 0, result.length);
    }
    
    public void testSnappyDoubleCompressionUnCompressWithAggressiveMocks1() throws Throwable {
        storeStaticField(SnappyCompression.class, "LOGGER");
        storeStaticField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG");
        SnappyCompression.SnappyDoubleCompression snappyDoubleCompression = (SnappyCompression.SnappyDoubleCompression) Mockingbird.getProxyObject(SnappyCompression.SnappyDoubleCompression.class, true);
        byte[] bytes = new byte[0];
        IOException iOException = (IOException) Mockingbird.getProxyObject(IOException.class);
        LogService logService = (LogService) Mockingbird.getProxyObject(LogService.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(Snappy.uncompressDoubleArray(bytes), iOException);
        setPrivateField(SnappyCompression.class, "LOGGER", logService);
        setPrivateField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG", null);
        Mockingbird.setReturnValue(false, iOException, "getMessage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, logService, "error", "(com.huawei.iweb.platform.logging.LogEvent,java.lang.Throwable,java.lang.Object[])void", null, 1);
        Mockingbird.enterTestMode(SnappyCompression.SnappyDoubleCompression.class);
        double[] result = snappyDoubleCompression.unCompress(bytes);
        assertNull("result", result);
    }
    
    public void testSnappyDoubleCompressionValues() throws Throwable {
        SnappyCompression.SnappyDoubleCompression[] result = SnappyCompression.SnappyDoubleCompression.values();
        assertEquals("result.length", 1, result.length);
        assertEquals("result[0]", SnappyCompression.SnappyDoubleCompression.INSTANCE, result[0]);
    }
    
    public void testSnappyFloatCompressionUnCompressWithAggressiveMocks() throws Throwable {
        SnappyCompression.SnappyFloatCompression snappyFloatCompression = (SnappyCompression.SnappyFloatCompression) Mockingbird.getProxyObject(SnappyCompression.SnappyFloatCompression.class, true);
        byte[] bytes = new byte[0];
        float[] floats = new float[0];
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(Snappy.uncompressFloatArray(bytes), floats);
        Mockingbird.enterTestMode(SnappyCompression.SnappyFloatCompression.class);
        float[] result = snappyFloatCompression.unCompress(bytes);
        assertEquals("result.length", 0, result.length);
    }
    
    public void testSnappyFloatCompressionUnCompressWithAggressiveMocks1() throws Throwable {
        storeStaticField(SnappyCompression.class, "LOGGER");
        storeStaticField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG");
        SnappyCompression.SnappyFloatCompression snappyFloatCompression = (SnappyCompression.SnappyFloatCompression) Mockingbird.getProxyObject(SnappyCompression.SnappyFloatCompression.class, true);
        byte[] bytes = new byte[0];
        IOException iOException = (IOException) Mockingbird.getProxyObject(IOException.class);
        LogService logService = (LogService) Mockingbird.getProxyObject(LogService.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(Snappy.uncompressFloatArray(bytes), iOException);
        setPrivateField(SnappyCompression.class, "LOGGER", logService);
        setPrivateField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG", null);
        Mockingbird.setReturnValue(false, iOException, "getMessage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, logService, "error", "(com.huawei.iweb.platform.logging.LogEvent,java.lang.Throwable,java.lang.Object[])void", null, 1);
        Mockingbird.enterTestMode(SnappyCompression.SnappyFloatCompression.class);
        float[] result = snappyFloatCompression.unCompress(bytes);
        assertNull("result", result);
    }
    
    public void testSnappyFloatCompressionValues() throws Throwable {
        SnappyCompression.SnappyFloatCompression[] result = SnappyCompression.SnappyFloatCompression.values();
        assertEquals("result.length", 1, result.length);
        assertEquals("result[0]", SnappyCompression.SnappyFloatCompression.INSTANCE, result[0]);
    }
    
    public void testSnappyIntCompressionUnCompressWithAggressiveMocks() throws Throwable {
        SnappyCompression.SnappyIntCompression snappyIntCompression = (SnappyCompression.SnappyIntCompression) Mockingbird.getProxyObject(SnappyCompression.SnappyIntCompression.class, true);
        byte[] bytes = new byte[0];
        int[] ints = new int[0];
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(Snappy.uncompressIntArray(bytes), ints);
        Mockingbird.enterTestMode(SnappyCompression.SnappyIntCompression.class);
        int[] result = snappyIntCompression.unCompress(bytes);
        assertEquals("result.length", 0, result.length);
    }
    
    public void testSnappyIntCompressionUnCompressWithAggressiveMocks1() throws Throwable {
        storeStaticField(SnappyCompression.class, "LOGGER");
        storeStaticField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG");
        SnappyCompression.SnappyIntCompression snappyIntCompression = (SnappyCompression.SnappyIntCompression) Mockingbird.getProxyObject(SnappyCompression.SnappyIntCompression.class, true);
        byte[] bytes = new byte[0];
        IOException iOException = (IOException) Mockingbird.getProxyObject(IOException.class);
        LogService logService = (LogService) Mockingbird.getProxyObject(LogService.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(Snappy.uncompressIntArray(bytes), iOException);
        setPrivateField(SnappyCompression.class, "LOGGER", logService);
        setPrivateField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG", null);
        Mockingbird.setReturnValue(false, iOException, "getMessage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, logService, "error", "(com.huawei.iweb.platform.logging.LogEvent,java.lang.Throwable,java.lang.Object[])void", null, 1);
        Mockingbird.enterTestMode(SnappyCompression.SnappyIntCompression.class);
        int[] result = snappyIntCompression.unCompress(bytes);
        assertNull("result", result);
    }
    
    public void testSnappyIntCompressionValueOf() throws Throwable {
        SnappyCompression.SnappyIntCompression result = SnappyCompression.SnappyIntCompression.valueOf("INSTANCE");
        assertEquals("result", SnappyCompression.SnappyIntCompression.INSTANCE, result);
    }
    
    public void testSnappyIntCompressionValues() throws Throwable {
        SnappyCompression.SnappyIntCompression[] result = SnappyCompression.SnappyIntCompression.values();
        assertEquals("result.length", 1, result.length);
        assertEquals("result[0]", SnappyCompression.SnappyIntCompression.INSTANCE, result[0]);
    }
    
    public void testSnappyLongCompressionUnCompressWithAggressiveMocks() throws Throwable {
        SnappyCompression.SnappyLongCompression snappyLongCompression = (SnappyCompression.SnappyLongCompression) Mockingbird.getProxyObject(SnappyCompression.SnappyLongCompression.class, true);
        byte[] bytes = new byte[0];
        long[] longs = new long[0];
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(Snappy.uncompressLongArray(bytes), longs);
        Mockingbird.enterTestMode(SnappyCompression.SnappyLongCompression.class);
        long[] result = snappyLongCompression.unCompress(bytes);
        assertEquals("result.length", 0, result.length);
    }
    
    public void testSnappyLongCompressionUnCompressWithAggressiveMocks1() throws Throwable {
        storeStaticField(SnappyCompression.class, "LOGGER");
        storeStaticField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG");
        SnappyCompression.SnappyLongCompression snappyLongCompression = (SnappyCompression.SnappyLongCompression) Mockingbird.getProxyObject(SnappyCompression.SnappyLongCompression.class, true);
        byte[] bytes = new byte[0];
        IOException iOException = (IOException) Mockingbird.getProxyObject(IOException.class);
        LogService logService = (LogService) Mockingbird.getProxyObject(LogService.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(Snappy.uncompressLongArray(bytes), iOException);
        setPrivateField(SnappyCompression.class, "LOGGER", logService);
        setPrivateField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG", null);
        Mockingbird.setReturnValue(false, iOException, "getMessage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, logService, "error", "(com.huawei.iweb.platform.logging.LogEvent,java.lang.Throwable,java.lang.Object[])void", null, 1);
        Mockingbird.enterTestMode(SnappyCompression.SnappyLongCompression.class);
        long[] result = snappyLongCompression.unCompress(bytes);
        assertNull("result", result);
    }
    
    public void testSnappyLongCompressionValues() throws Throwable {
        SnappyCompression.SnappyLongCompression[] result = SnappyCompression.SnappyLongCompression.values();
        assertEquals("result.length", 1, result.length);
        assertEquals("result[0]", SnappyCompression.SnappyLongCompression.INSTANCE, result[0]);
    }
    
    public void testSnappyShortCompressionUnCompressWithAggressiveMocks() throws Throwable {
        SnappyCompression.SnappyShortCompression snappyShortCompression = (SnappyCompression.SnappyShortCompression) Mockingbird.getProxyObject(SnappyCompression.SnappyShortCompression.class, true);
        byte[] bytes = new byte[0];
        short[] shorts = new short[0];
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(Snappy.uncompressShortArray(bytes), shorts);
        Mockingbird.enterTestMode(SnappyCompression.SnappyShortCompression.class);
        short[] result = snappyShortCompression.unCompress(bytes);
        assertEquals("result.length", 0, result.length);
    }
    
    public void testSnappyShortCompressionUnCompressWithAggressiveMocks1() throws Throwable {
        storeStaticField(SnappyCompression.class, "LOGGER");
        storeStaticField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG");
        SnappyCompression.SnappyShortCompression snappyShortCompression = (SnappyCompression.SnappyShortCompression) Mockingbird.getProxyObject(SnappyCompression.SnappyShortCompression.class, true);
        byte[] bytes = new byte[0];
        IOException iOException = (IOException) Mockingbird.getProxyObject(IOException.class);
        LogService logService = (LogService) Mockingbird.getProxyObject(LogService.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(Snappy.uncompressShortArray(bytes), iOException);
        setPrivateField(SnappyCompression.class, "LOGGER", logService);
        setPrivateField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG", null);
        Mockingbird.setReturnValue(false, iOException, "getMessage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, logService, "error", "(com.huawei.iweb.platform.logging.LogEvent,java.lang.Throwable,java.lang.Object[])void", null, 1);
        Mockingbird.enterTestMode(SnappyCompression.SnappyShortCompression.class);
        short[] result = snappyShortCompression.unCompress(bytes);
        assertNull("result", result);
    }
    
    public void testSnappyShortCompressionValueOf() throws Throwable {
        SnappyCompression.SnappyShortCompression result = SnappyCompression.SnappyShortCompression.valueOf("INSTANCE");
        assertEquals("result", SnappyCompression.SnappyShortCompression.INSTANCE, result);
    }
    
    public void testSnappyShortCompressionValues() throws Throwable {
        SnappyCompression.SnappyShortCompression[] result = SnappyCompression.SnappyShortCompression.values();
        assertEquals("result.length", 1, result.length);
        assertEquals("result[0]", SnappyCompression.SnappyShortCompression.INSTANCE, result[0]);
    }
    
    public void testSnappyByteCompressionCompressThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyByteCompression.INSTANCE.compress((byte[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(SnappyCompression.SnappyByteCompression.class, ex);
        }
    }
    
    public void testSnappyByteCompressionUnCompressThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyByteCompression.INSTANCE.unCompress((byte[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Snappy.class, ex);
        }
    }
    
    public void testSnappyByteCompressionValueOfThrowsIllegalArgumentException() throws Throwable {
        try {
            SnappyCompression.SnappyByteCompression.valueOf("testSnappyByteCompressionParam1");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "No enum const class com.huawei.unibi.molap.datastorage.store.compression.SnappyCompression$SnappyByteCompression.testSnappyByteCompressionParam1", ex.getMessage());
            assertThrownBy(Enum.class, ex);
        }
    }
    
    public void testSnappyByteCompressionValueOfThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyByteCompression.valueOf(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("ex.getMessage()", "Name is null", ex.getMessage());
            assertThrownBy(Enum.class, ex);
        }
    }
    
    public void testSnappyDoubleCompressionCompressThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyDoubleCompression.INSTANCE.compress((double[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Snappy.class, ex);
        }
    }
    
    public void testSnappyDoubleCompressionUnCompressThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyDoubleCompression.INSTANCE.unCompress((byte[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Snappy.class, ex);
        }
    }
    
    public void testSnappyDoubleCompressionValueOfThrowsIllegalArgumentException() throws Throwable {
        try {
            SnappyCompression.SnappyDoubleCompression.valueOf("testSnappyDoubleCompressionParam1");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "No enum const class com.huawei.unibi.molap.datastorage.store.compression.SnappyCompression$SnappyDoubleCompression.testSnappyDoubleCompressionParam1", ex.getMessage());
            assertThrownBy(Enum.class, ex);
        }
    }
    
    public void testSnappyDoubleCompressionValueOfThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyDoubleCompression.valueOf(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("ex.getMessage()", "Name is null", ex.getMessage());
            assertThrownBy(Enum.class, ex);
        }
    }
    
    public void testSnappyFloatCompressionCompressThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyFloatCompression.INSTANCE.compress((float[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Snappy.class, ex);
        }
    }
    
    public void testSnappyFloatCompressionUnCompressThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyFloatCompression.INSTANCE.unCompress((byte[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Snappy.class, ex);
        }
    }
    
    public void testSnappyFloatCompressionValueOfThrowsIllegalArgumentException() throws Throwable {
        try {
            SnappyCompression.SnappyFloatCompression.valueOf("testSnappyFloatCompressionParam1");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "No enum const class com.huawei.unibi.molap.datastorage.store.compression.SnappyCompression$SnappyFloatCompression.testSnappyFloatCompressionParam1", ex.getMessage());
            assertThrownBy(Enum.class, ex);
        }
    }
    
    public void testSnappyFloatCompressionValueOfThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyFloatCompression.valueOf(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("ex.getMessage()", "Name is null", ex.getMessage());
            assertThrownBy(Enum.class, ex);
        }
    }
    
    public void testSnappyIntCompressionCompressThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyIntCompression.INSTANCE.compress((int[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Snappy.class, ex);
        }
    }
    
    public void testSnappyIntCompressionUnCompressThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyIntCompression.INSTANCE.unCompress((byte[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Snappy.class, ex);
        }
    }
    
    public void testSnappyIntCompressionValueOfThrowsIllegalArgumentException() throws Throwable {
        try {
            SnappyCompression.SnappyIntCompression.valueOf("testSnappyIntCompressionParam1");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "No enum const class com.huawei.unibi.molap.datastorage.store.compression.SnappyCompression$SnappyIntCompression.testSnappyIntCompressionParam1", ex.getMessage());
            assertThrownBy(Enum.class, ex);
        }
    }
    
    public void testSnappyIntCompressionValueOfThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyIntCompression.valueOf(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("ex.getMessage()", "Name is null", ex.getMessage());
            assertThrownBy(Enum.class, ex);
        }
    }
    
    public void testSnappyLongCompressionCompressThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyLongCompression.INSTANCE.compress((long[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Snappy.class, ex);
        }
    }
    
    public void testSnappyLongCompressionUnCompressThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyLongCompression.INSTANCE.unCompress((byte[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Snappy.class, ex);
        }
    }
    
    public void testSnappyLongCompressionValueOfThrowsIllegalArgumentException() throws Throwable {
        try {
            SnappyCompression.SnappyLongCompression.valueOf("testSnappyLongCompressionParam1");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "No enum const class com.huawei.unibi.molap.datastorage.store.compression.SnappyCompression$SnappyLongCompression.testSnappyLongCompressionParam1", ex.getMessage());
            assertThrownBy(Enum.class, ex);
        }
    }
    
    public void testSnappyLongCompressionValueOfThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyLongCompression.valueOf(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("ex.getMessage()", "Name is null", ex.getMessage());
            assertThrownBy(Enum.class, ex);
        }
    }
    
    public void testSnappyShortCompressionCompressThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyShortCompression.INSTANCE.compress((short[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Snappy.class, ex);
        }
    }
    
    public void testSnappyShortCompressionUnCompressThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyShortCompression.INSTANCE.unCompress((byte[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Snappy.class, ex);
        }
    }
    
    public void testSnappyShortCompressionValueOfThrowsIllegalArgumentException() throws Throwable {
        try {
            SnappyCompression.SnappyShortCompression.valueOf("testSnappyShortCompressionParam1");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "No enum const class com.huawei.unibi.molap.datastorage.store.compression.SnappyCompression$SnappyShortCompression.testSnappyShortCompressionParam1", ex.getMessage());
            assertThrownBy(Enum.class, ex);
        }
    }
    
    public void testSnappyShortCompressionValueOfThrowsNullPointerException() throws Throwable {
        try {
            SnappyCompression.SnappyShortCompression.valueOf(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("ex.getMessage()", "Name is null", ex.getMessage());
            assertThrownBy(Enum.class, ex);
        }
    }
}
