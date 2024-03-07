import os, shutil

KINGDOM_COUNT = 13
codeGenRootDir = os.path.dirname(os.path.realpath(__file__))

def Template(templatePath: str, outputPath: str, itemTemplate: dict[str, list[str]], tabCount: int = 1) -> bool:
    with open(templatePath, "r") as templateFile, open(outputPath, "w") as outputFile:
        template = ""
        indent = "    " * tabCount

        for i in range(1, KINGDOM_COUNT+1):
            template += indent +  f"// ITEMS FOR KINGDOM {i}\n"
            for t in itemTemplate:
                template += indent + t.format(i) + "\n"
            template += "\n"

        outputFile.write(templateFile.read().replace("//%KINGDOM_ITEMS%", template))
    return True

modItems = Template(os.path.join(codeGenRootDir, "ModItems.java"),
                    os.path.join(codeGenRootDir, "../src/main/java/uk/fallingsloth/mc/items/ModItems.java"),
                    [
                        "public static final Item KINGDOM{0}_ESSENCE = registerItem(\"kingdom{0}_essence\", new Item(new FabricItemSettings().maxCount(16)));",
                        "public static final Item KINGDOM{0}_SWORD = registerItem(\"kingdom{0}_sword\", new SwordItem(ToolMaterials.NETHERITE, 3, -2.4f, new FabricItemSettings()));",
                        "public static final Item KINGDOM{0}_SHIELD = registerItem(\"kingdom{0}_shield\", new ShieldItem(new FabricItemSettings()));",
                        "public static final Item KINGDOM{0}_BOW = registerItem(\"kingdom{0}_bow\", new BowItem(new FabricItemSettings()));",
                        #"public static final Item KINGDOM{0}_CROSSBOW = registerItem(\"kingdom{0}_crossbow\", new CrossbowItem(new FabricItemSettings()));",

                        "public static final Item KINGDOM{0}_HELMET = registerItem(\"kingdom{0}_helmet\", new ArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));",
                        "public static final Item KINGDOM{0}_CHESTPLATE = registerItem(\"kingdom{0}_chestplate\", new ArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));",
                        "public static final Item KINGDOM{0}_LEGGINGS = registerItem(\"kingdom{0}_leggings\", new ArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));",
                        "public static final Item KINGDOM{0}_BOOTS = registerItem(\"kingdom{0}_boots\", new ArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));"
                    ])

modItemGroups = Template(os.path.join(codeGenRootDir, "ModItemGroups.java"),
                         os.path.join(codeGenRootDir, "../src/main/java/uk/fallingsloth/mc/items/ModItemGroups.java"),
                         [
                             "entries.add(ModItems.KINGDOM{0}_ESSENCE);",
                             "entries.add(ModItems.KINGDOM{0}_SWORD);",
                             "entries.add(ModItems.KINGDOM{0}_SHIELD);",
                             "entries.add(ModItems.KINGDOM{0}_BOW);",
                             #"entries.add(ModItems.KINGDOM{0}_CROSSBOW);",

                             "entries.add(ModItems.KINGDOM{0}_HELMET);",
                             "entries.add(ModItems.KINGDOM{0}_CHESTPLATE);",
                             "entries.add(ModItems.KINGDOM{0}_LEGGINGS);",
                             "entries.add(ModItems.KINGDOM{0}_BOOTS);"
                         ], 6)

modModelProvider = Template(os.path.join(codeGenRootDir, "ModModelProvider.java"),
                            os.path.join(codeGenRootDir, "../src/main/java/uk/fallingsloth/mc/datagen/ModModelProvider.java"),
                            [
                                "itemModelGenerator.register(ModItems.KINGDOM{0}_ESSENCE, Models.GENERATED);",
                                "itemModelGenerator.register(ModItems.KINGDOM{0}_SWORD, Models.HANDHELD);",
                                "itemModelGenerator.register(ModItems.KINGDOM{0}_SHIELD, Models.HANDHELD);",

                                "itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM{0}_HELMET);",
                                "itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM{0}_CHESTPLATE);",
                                "itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM{0}_LEGGINGS);",
                                "itemModelGenerator.registerArmor((ArmorItem)ModItems.KINGDOM{0}_BOOTS);"
                            ], 2)

modModelPredicateProvider = Template(os.path.join(codeGenRootDir, "ModModelPredicateProvider.java"),
                                     os.path.join(codeGenRootDir, "../src/main/java/uk/fallingsloth/mc/datagen/ModModelPredicateProvider.java"),
                                     [ "registerBow(ModItems.KINGDOM{0}_BOW);" ], 2)

recipe_template = "ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.KINGDOM{{0}}_{item}).input(ModItems.KINGDOM{{0}}_ESSENCE).input(Items.{input}).criterion(hasItem(ModItems.KINGDOM{{0}}_ESSENCE), conditionsFromItem(ModItems.KINGDOM{{0}}_ESSENCE)).offerTo(exporter, new Identifier(getRecipeName(ModItems.KINGDOM{{0}}_{item})));"
recipe_items = [
    ("SWORD", "NETHERITE_SWORD"),
    ("SHIELD", "SHIELD"),
    ("BOW", "BOW"),
    #("CROSSBOW", "CROSSBOW"),
    ("HELMET", "NETHERITE_HELMET"),
    ("CHESTPLATE", "NETHERITE_CHESTPLATE"),
    ("LEGGINGS", "NETHERITE_LEGGINGS"),
    ("BOOTS", "NETHERITE_BOOTS")
]
modRecipeProvider = Template(os.path.join(codeGenRootDir, "ModRecipeProvider.java"),
                             os.path.join(codeGenRootDir, "../src/main/java/uk/fallingsloth/mc/datagen/ModRecipeProvider.java"),
                             [recipe_template.format(item=item, input=input) for item, input in recipe_items], 2)



# copy item sprite defaults
textures = [path for path in os.listdir(os.path.join(codeGenRootDir, "item textures"))]
for i in range(1, KINGDOM_COUNT+1):
    for texture in textures:
        shutil.copy(os.path.join(codeGenRootDir, "item textures", texture),
                    os.path.join(codeGenRootDir, "../src/main/resources/assets/kingdoms/textures/item", f"kingdom{i}_{texture}"))
textures = [path for path in os.listdir(os.path.join(codeGenRootDir, "entity textures"))]
for i in range(1, KINGDOM_COUNT+1):
    for texture in textures:
        shutil.copy(os.path.join(codeGenRootDir, "entity textures", texture),
                    os.path.join(codeGenRootDir, "../src/main/resources/assets/kingdoms/textures/entity", f"kingdom{i}_{texture}"))

# copy item model json
modelFiles = [
    "bow.json",
    "bow_pulling_0.json",
    "bow_pulling_1.json",
    "bow_pulling_2.json"
]
for i in range(1, KINGDOM_COUNT+1):
    for modelFile in modelFiles:
        with open(os.path.join(codeGenRootDir, "json", modelFile), "r") as templateFile, open(os.path.join(codeGenRootDir, "../src/main/resources/assets/kingdoms/models/item/", f"kingdom{i}_{modelFile}"), "w") as outputFile:
            outputFile.write(templateFile.read().replace("%i%", str(i)))

print("Success!")