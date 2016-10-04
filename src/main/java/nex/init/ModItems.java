/*
 * Copyright (C) 2016.  LogicTechCorp
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package nex.init;

import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import nex.block.IVariantContainer;
import nex.item.ItemRime;

import java.util.List;

public class ModItems
{
    public static final Item RIME;

    public static List<IVariantContainer> variantContainers = Lists.newArrayList();

    static
    {
        RIME = new ItemRime();
    }

    public static void init()
    {

    }
}