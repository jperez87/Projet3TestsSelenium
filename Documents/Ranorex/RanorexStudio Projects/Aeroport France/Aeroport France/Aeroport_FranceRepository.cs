﻿///////////////////////////////////////////////////////////////////////////////
//
// This file was automatically generated by RANOREX.
// DO NOT MODIFY THIS FILE! It is regenerated by the designer.
// All your modifications will be lost!
// http://www.ranorex.com
//
///////////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Text;
using System.Drawing;
using Ranorex;
using Ranorex.Core;
using Ranorex.Core.Repository;
using Ranorex.Core.Testing;

namespace Aeroport_France
{
#pragma warning disable 0436 //(CS0436) The type 'type' in 'assembly' conflicts with the imported type 'type2' in 'assembly'. Using the type defined in 'assembly'.
    /// <summary>
    /// The class representing the Aeroport_FranceRepository element repository.
    /// </summary>
    [System.CodeDom.Compiler.GeneratedCode("Ranorex", "8.3")]
    [RepositoryFolder("b21cf727-eac1-4bd1-90b0-476940d0002d")]
    public partial class Aeroport_FranceRepository : RepoGenBaseFolder
    {
        static Aeroport_FranceRepository instance = new Aeroport_FranceRepository();

        /// <summary>
        /// Gets the singleton class instance representing the Aeroport_FranceRepository element repository.
        /// </summary>
        [RepositoryFolder("b21cf727-eac1-4bd1-90b0-476940d0002d")]
        public static Aeroport_FranceRepository Instance
        {
            get { return instance; }
        }

        /// <summary>
        /// Repository class constructor.
        /// </summary>
        public Aeroport_FranceRepository() 
            : base("Aeroport_FranceRepository", "/", null, 0, false, "b21cf727-eac1-4bd1-90b0-476940d0002d", ".\\RepositoryImages\\Aeroport_FranceRepositoryb21cf727.rximgres")
        {
        }

#region Variables

#endregion

        /// <summary>
        /// The Self item info.
        /// </summary>
        [RepositoryItemInfo("b21cf727-eac1-4bd1-90b0-476940d0002d")]
        public virtual RepoItemInfo SelfInfo
        {
            get
            {
                return _selfInfo;
            }
        }
    }

    /// <summary>
    /// Inner folder classes.
    /// </summary>
    [System.CodeDom.Compiler.GeneratedCode("Ranorex", "8.3")]
    public partial class Aeroport_FranceRepositoryFolders
    {
    }
#pragma warning restore 0436
}