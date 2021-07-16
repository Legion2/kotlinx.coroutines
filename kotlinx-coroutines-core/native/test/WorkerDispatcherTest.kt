///*
// * Copyright 2016-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
// */
//
//package kotlinx.coroutines
//
//import kotlinx.atomicfu.*
//import kotlin.test.*
//
//class WorkerDispatcherTest : TestBase() {
//    private val dispatcher = newSingleThreadContext("WorkerCoroutineDispatcherTest")
//    private val mainThread = currentThread()
//
//    @Test
//    fun testWithContext() = runTest {
//        val atomic = atomic(0) // can be captured & shared
//        expect(1)
//        val result = withContext(dispatcher) {
//            //expect(2)
//            assertEquals(dispatcher.thread, currentThread())
//            atomic.value = 42
//            "OK"
//        }
//        assertEquals(mainThread, currentThread())
//        //assertEquals("OK", result)
//        //assertEquals(42, atomic.value)
//        //finish(3)
//    }
//}