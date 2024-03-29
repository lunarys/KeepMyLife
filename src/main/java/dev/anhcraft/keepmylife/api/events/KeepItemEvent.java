package dev.anhcraft.keepmylife.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class KeepItemEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private List<ItemStack> dropItems;
    private List<ItemStack> keepItems;
    private boolean keepExp;
    private Player player;

    public KeepItemEvent(Player player, List<ItemStack> dropItems, List<ItemStack> keepItems, boolean keepExp) {
        this.dropItems = dropItems;
        this.keepItems = keepItems;
        this.keepExp = keepExp;
        this.player = player;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isKeepExp() {
        return keepExp;
    }

    public void setKeepExp(boolean keepExp) {
        this.keepExp = keepExp;
    }

    public List<ItemStack> getKeepItems() {
        return keepItems;
    }

    public List<ItemStack> getDropItems() {
        return dropItems;
    }
}