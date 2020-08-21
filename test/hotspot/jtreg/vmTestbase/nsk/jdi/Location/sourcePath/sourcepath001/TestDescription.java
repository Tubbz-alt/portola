/*
 * Copyright (c) 2018, 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


/*
 * @test
 *
 * @summary converted from VM Testbase nsk/jdi/Location/sourcePath/sourcepath001.
 * VM Testbase keywords: [jpda, jdi]
 * VM Testbase readme:
 * DESCRIPTION:
 *     The test for the implementation of an object of the type
 *     Location.
 *     The test checks up that a result of the method
 *     com.sun.jdi.Location.sourcePath()
 *     complies with its spec:
 *     public String sourcePath()
 *                   throws AbsentInformationException
 *     Gets the path to the source corresponding to this location.
 *     This method is equivalent to sourcePath(vm.getDefaultStratum()) - see
 *     sourcePath(String) for more information.
 *     Returns: a string specifying the source
 *     Throws:  AbsentInformationException -
 *              if the source name is not known
 *     The test checks that
 *     - invocation of  the method doesn't throw an error or unspecified exception;                                <BR>
 *     - returned value is debuggee's
 *       "unqualified name of the source file for this Location".
 *     The test works as follows:
 *     The debugger program - nsk.jdi.Location.sourcePath.sourcepath001;
 *     the debuggee program - nsk.jdi.Location.sourcePath.sourcepath001a.
 *     Using nsk.jdi.share classes,
 *     the debugger gets the debuggee running on another JavaVM,
 *     creates the object debuggee.VM,
 *     establishes a pipe with the debuggee program, and then
 *     send to the programm commands, to which the debuggee replies
 *     via the pipe. Upon getting reply,
 *     the debugger calls corresponding debuggee.VM methods to get
 *     needed data and performes the testing call.
 *     In case of error the test produces the return value 97 and
 *     a corresponding error message(s).
 *     Otherwise, the test is passed and produces
 *     the return value 95 and no message.
 * COMMENTS:
 *
 * @library /vmTestbase
 *          /test/lib
 * @build nsk.jdi.Location.sourcePath.sourcepath001
 *        nsk.jdi.Location.sourcePath.sourcepath001a
 *
 * @comment make sure sourcepath001a is compiled with full debug info
 * @clean nsk.jdi.Location.sourcePath.sourcepath001a
 * @compile -g:lines,source,vars ../sourcepath001a.java
 *
 * @run main/othervm PropertyResolvingWrapper
 *      nsk.jdi.Location.sourcePath.sourcepath001
 *      -verbose
 *      -arch=${os.family}-${os.simpleArch}
 *      -waittime=5
 *      -debugee.vmkind=java
 *      -transport.address=dynamic
 *      "-debugee.vmkeys=${test.vm.opts} ${test.java.opts}"
 */

