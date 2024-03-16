package com.willfp.ecoquests.commands

import com.willfp.eco.core.EcoPlugin
import com.willfp.eco.core.command.impl.Subcommand
import com.willfp.ecoquests.tasks.Tasks
import org.bukkit.command.CommandSender

class CommandReload(plugin: EcoPlugin) : Subcommand(
    plugin,
    "reload",
    "ecoquests.command.reload",
    false
) {
    override fun onExecute(sender: CommandSender, args: List<String>) {
        Tasks.reload(plugin)
        plugin.reload()
        sender.sendMessage(plugin.langYml.getMessage("reloaded"))
    }
}
