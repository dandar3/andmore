/*
 * Copyright (C) 2014 The Android Open Source Project
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

package com.android.hierarchyviewerlib.actions;

import com.android.hierarchyviewerlib.HierarchyViewerDirector;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;

public class EvaluateContrastAction extends Action implements ImageAction {

    private static EvaluateContrastAction sAction;

    private Image mImage;

    private Shell mShell;

    private EvaluateContrastAction(Shell shell) {
        super("&Evaluate Contrast");
        mShell = shell;
        setAccelerator(SWT.MOD1 + 'D');
        setToolTipText("Evaluate the contrast ratio of this view.");
        // TODO: Get icon for Button
    }

    public static EvaluateContrastAction getAction(Shell shell) {
        if (sAction == null) {
            sAction = new EvaluateContrastAction(shell);
        }
        return sAction;
    }

    @Override
    public void run() {
        HierarchyViewerDirector.getDirector().showEvaluateContrast(mShell);
    }

    @Override
    public Image getImage() {
        return mImage;
    }
}
