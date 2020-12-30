/*
 * Copyright © 2020 LambdAurora <aurora42lambda@gmail.com>
 *
 * This file is part of SpruceUI.
 *
 * Licensed under the MIT license. For more information,
 * see the LICENSE file.
 */

package me.lambdaurora.spruceui.background;

import me.lambdaurora.spruceui.widget.SpruceWidget;
import net.minecraft.client.util.math.MatrixStack;

/**
 * Represents a background which can be rendered on a widget.
 *
 * @author LambdAurora
 * @version 1.7.0
 * @since 1.7.0
 */
public interface Background {
    void render(MatrixStack matrices, SpruceWidget widget, int vOffset, int mouseX, int mouseY, float delta);
}