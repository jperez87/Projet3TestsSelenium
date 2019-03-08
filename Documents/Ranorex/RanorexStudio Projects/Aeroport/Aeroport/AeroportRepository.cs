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

namespace Aeroport
{
#pragma warning disable 0436 //(CS0436) The type 'type' in 'assembly' conflicts with the imported type 'type2' in 'assembly'. Using the type defined in 'assembly'.
    /// <summary>
    /// The class representing the AeroportRepository element repository.
    /// </summary>
    [System.CodeDom.Compiler.GeneratedCode("Ranorex", "8.3")]
    [RepositoryFolder("8eb8d1f5-80dc-4e50-aa02-93e041dd86c5")]
    public partial class AeroportRepository : RepoGenBaseFolder
    {
        static AeroportRepository instance = new AeroportRepository();

        /// <summary>
        /// Gets the singleton class instance representing the AeroportRepository element repository.
        /// </summary>
        [RepositoryFolder("8eb8d1f5-80dc-4e50-aa02-93e041dd86c5")]
        public static AeroportRepository Instance
        {
            get { return instance; }
        }

        /// <summary>
        /// Repository class constructor.
        /// </summary>
        public AeroportRepository() 
            : base("AeroportRepository", "/", null, 0, false, "8eb8d1f5-80dc-4e50-aa02-93e041dd86c5", ".\\RepositoryImages\\AeroportRepository8eb8d1f5.rximgres")
        {
        }

#region Variables

#endregion

        /// <summary>
        /// The Self item info.
        /// </summary>
        [RepositoryItemInfo("8eb8d1f5-80dc-4e50-aa02-93e041dd86c5")]
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
    public partial class AeroportRepositoryFolders
    {
    }
#pragma warning restore 0436
}