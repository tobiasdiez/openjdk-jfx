/*
 * Copyright (c) 2011, 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
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

package javafx.scene.control.skin;

import javafx.scene.control.ColorPicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PopupControl;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 *
 */
public class ColorPickerPaletteShim {

    private static ColorPalette getColorPalette(ColorPicker cp) {
        ColorPickerSkin cpSkin = (ColorPickerSkin)cp.getSkin();
        return (ColorPalette)cpSkin.getPopupContent();
    }

    public static GridPane getColorGrid(ColorPicker cp) {
        ColorPalette pal = getColorPalette(cp);
        return pal.getColorGrid();
    }

    public static PopupControl getPopup(ColorPicker cp) {
        ColorPickerSkin cpSkin = (ColorPickerSkin)cp.getSkin();
        return cpSkin.getPopup();
    }

    public static Hyperlink ColorPallette_getCustomColorLink(ColorPicker cp) {
        return getColorPalette(cp).customColorLink;
    }


    public static Stage ColorPallette_getCustomColorDialog(ColorPicker cp) {
        ColorPalette pal = getColorPalette(cp);
        if (pal.customColorDialog != null) return pal.customColorDialog.getDialog();
        return null;
    }
}
